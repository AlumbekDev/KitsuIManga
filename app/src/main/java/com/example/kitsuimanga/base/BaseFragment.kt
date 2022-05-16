package com.example.kitsuimanga.base

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.paging.PagingData
import androidx.viewbinding.ViewBinding
import com.example.kitsuimanga.presentation.ui.state.UiState
import com.google.android.material.progressindicator.CircularProgressIndicator
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

abstract class BaseFragment<Binding : ViewBinding, ViewModel : BaseViewModel>(@LayoutRes layoutId: Int) :
    Fragment(
        layoutId
    ) {
    protected abstract val binding: Binding
    protected abstract val viewModel: ViewModel
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
        setupViews()
        setupListeners()
        setupRequest()
        setupObservers()
    }

    protected open fun initialize() {
    }

    protected open fun setupViews() {
    }

    protected open fun setupListeners() {
    }

    protected open fun setupRequest() {
    }

    protected open fun setupObservers() {
    }

    protected fun <T : Any> Flow<PagingData<T>>.spectatePaging(
        lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
        success: suspend (data: PagingData<T>) -> Unit,
        error: ((error: String) -> Unit)? = null,
    ) {
        FlowGather(lifecycleState) {
            collectLatest {
                success(it)
                error(it)
            }
        }
    }

    protected fun <T> StateFlow<UiState<T>>.collectUiState(
        lifecycleState: Lifecycle.State = Lifecycle.State.STARTED,
        success: ((data: T) -> Unit)? = null,
        loading: ((data: UiState.Loading<T>) -> Unit)? = null,
        error: ((error: String) -> Unit)? = null,
        idle: ((idle: UiState.Idle<T>) -> Unit)? = null,
        gatherIfSucceed: ((state: UiState<T>) -> Unit)? = null,
    ) {
        FlowGather(lifecycleState) {
            collect {
                gatherIfSucceed?.invoke(it)
                when (it) {
                    is UiState.Idle -> {
                        idle?.invoke(it)
                    }
                    is UiState.Loading -> {
                        loading?.invoke(it)
                    }
                    is UiState.Error -> {
                        error?.invoke(it.error)
                    }
                    is UiState.Success -> {
                        success?.invoke(it.data)
                    }
                }
            }
        }
    }

    private fun FlowGather(
        lifecycleState: Lifecycle.State,
        gather: suspend () -> Unit,
    ) {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(lifecycleState) {
                gather()
            }
        }
    }

    protected fun <T> UiState<T>.setupVisibility(
        group: ConstraintLayout,
        loader: CircularProgressIndicator,
        navigationSucceed: Boolean = false,
    ) {
        fun displayLoader(isDisplayed: Boolean) {
            group.isVisible = isDisplayed
            loader.isVisible = isDisplayed
        }
        when (this) {
            is UiState.Idle -> {

            }
            is UiState.Loading -> {
                displayLoader(true)
            }
            is UiState.Error -> {
                displayLoader(false)
            }
            is UiState.Success -> {
                if (navigationSucceed) {
                    displayLoader(true)
                } else {
                    displayLoader(false)
                }
            }
        }
    }
}
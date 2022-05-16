package com.example.kitsuimanga.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import androidx.paging.map
import com.example.domain.either.Either
import com.example.kitsuimanga.presentation.ui.state.UiState
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.launch

abstract class BaseViewModel : ViewModel() {
    protected fun <T> mutableUiStateFlow() = MutableStateFlow<UiState<T>>(UiState.Idle())

    protected fun <T, S> Flow<Either<String, T>>.gatherRequest(
        state: MutableStateFlow<UiState<S>>,
        mapData: (data: T) -> S,

        ) {
        viewModelScope.launch(Dispatchers.IO) {
            state.value = UiState.Loading()
            this@gatherRequest.collect {
                when (it) {
                    is Either.Left -> state.value = UiState.Error(it.value)
                    is Either.Right -> state.value = UiState.Success(mapData(it.value))
                }
            }
        }
    }

    protected fun <T : Any, S : Any> Flow<PagingData<T>>.collectPagingRequest(
        mappedData: (data: T) -> S,
    ) = map {
        it.map { data -> mappedData(data) }

    }.cachedIn(viewModelScope)
}
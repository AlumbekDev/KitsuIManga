package com.example.kitsuimanga.presentation.ui.fragments.authentication

import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.kitsuimanga.R
import com.example.kitsuimanga.base.BaseFragment
import com.example.kitsuimanga.databinding.FragmentSignInBinding
import com.example.kitsuimanga.presentation.exntensions.mainNavController
import com.example.kitsuimanga.presentation.exntensions.safeNavigation
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignInFragment :
    BaseFragment<FragmentSignInBinding, SignInViewModel>(R.layout.fragment_sign_in) {
    override val binding by viewBinding(FragmentSignInBinding::bind)
    override val viewModel: SignInViewModel by viewModels()

    override fun launchObservers() {
        subscribeToAuthorization()
    }

    private fun subscribeToAuthorization() {
        viewModel.signInState.spectateUiState(
            gatherIfSucceed = {
                it.setupVisibility(binding.signInContainer, binding.progressbar)
            },
            success = {

                mainNavController().safeNavigation(R.id.action_signInFlowFragment_to_mainFlowFragment)

            })
    }

    override fun setupListeners() {

        binding.btnSignIn.setOnClickListener {
            viewModel.signIn(binding.etEmail.text.toString(), binding.etPassword.text.toString())
        }
    }
}
package com.example.data.repositories

import com.example.data.local.preferences.PreferencesHelper
import com.example.data.remote.apiservice.AuthenticationApiService
import com.example.data.remote.dtos.authentication.AuthDto
import com.example.data.remote.dtos.authentication.toDomain
import com.example.data.repositories.base.BaseRepository
import com.example.domain.models.authentication.TokenModel
import com.example.domain.repositories.AuthenticationRepository
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val authenticationApiService: AuthenticationApiService,
    private val preferencesHelper: PreferencesHelper,
) : BaseRepository(), AuthenticationRepository {

    override fun authenticate(
        username: String,
        password: String,
    ) = sendRequest(this::saveToken) {
        authenticationApiService.authenticate(AuthDto(username = username, password = password))
            .toDomain()
    }

    private fun saveToken(tokenModel: TokenModel) {
        preferencesHelper.accessToken = tokenModel.accessToken
        preferencesHelper.refreshToken = tokenModel.refreshToken
        preferencesHelper.isAuthenticated = true
    }
}
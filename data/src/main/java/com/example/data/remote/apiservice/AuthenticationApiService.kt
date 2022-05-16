package com.example.data.remote.apiservice

import com.example.data.remote.dtos.authentication.AuthDto
import com.example.data.remote.dtos.authentication.TokenDto
import retrofit2.http.Body
import retrofit2.http.POST

interface AuthenticationApiService {

    @POST("token")
    suspend fun authenticate(
        @Body authDto: AuthDto

    ): TokenDto
}
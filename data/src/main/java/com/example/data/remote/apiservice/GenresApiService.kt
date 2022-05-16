package com.example.data.remote.apiservice

import com.example.data.remote.dtos.genres.GenresDto
import retrofit2.http.GET
import retrofit2.http.Path

interface GenresApiService {
    @GET("anime/{id}/genres")
    suspend fun fetchGenresAnime(@Path("id") id: String): GenresDto
}
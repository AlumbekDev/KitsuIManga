package com.example.data.remote.apiservice

import com.example.data.remote.dtos.genres.GenresDto
import com.example.domain.models.genres.GenresModel
import retrofit2.http.GET
import retrofit2.http.Path

interface GenresApiService {
    @GET("anime/{id}/genres")
    suspend fun fetchGenresAnime(@Path("id") id: String): GenresDto

    @GET("manga/{id}/genres")
    suspend fun fetchGenresManga(@Path("id") id: String): GenresDto
}
package com.example.data.remote.apiservice

import com.example.data.remote.dtos.anime.AnimeListDto
import com.example.data.remote.dtos.anime.SingleAnimeDto
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimeApiService {
    @GET("anime")
    suspend fun fetchAnimes(
        @Query("page[limit]") pageLimit: Int,
        @Query("page[offset]") pageOffset: Int,
    ): AnimeListDto

    @GET("anime")
    suspend fun fetchAnime(@Path("id") id: String): SingleAnimeDto
}
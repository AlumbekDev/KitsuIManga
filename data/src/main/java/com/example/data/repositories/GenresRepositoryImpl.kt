package com.example.data.repositories

import com.example.data.remote.apiservice.GenresApiService
import com.example.data.remote.dtos.anime.toDomain
import com.example.data.remote.dtos.genres.toDomain
import com.example.data.repositories.base.BaseRepository
import com.example.domain.repositories.GenresRepository
import javax.inject.Inject

class GenresRepositoryImpl @Inject constructor(
    private val genresApiService: GenresApiService,
) : BaseRepository(), GenresRepository {

    override fun fetchAnimeGenres(id: String) = sendRequest {
        genresApiService.fetchGenresAnime(id).toDomain()
    }

}
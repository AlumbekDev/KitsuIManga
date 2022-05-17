package com.example.domain.repositories

import com.example.domain.either.Either
import com.example.domain.models.genres.GenresList
import kotlinx.coroutines.flow.Flow

interface GenresRepository {
    fun fetchAnimeGenres(id: String): Flow<Either<String, GenresList>>
}
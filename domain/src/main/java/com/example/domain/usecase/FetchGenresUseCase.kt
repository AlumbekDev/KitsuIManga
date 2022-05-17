package com.example.domain.usecase

import com.example.domain.repositories.GenresRepository
import javax.inject.Inject

class FetchGenresUseCase @Inject constructor(
    private val genresRepository: GenresRepository
) {
    operator fun invoke(id : String) = genresRepository.fetchAnimeGenres(id)
}
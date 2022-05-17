package com.example.kitsuimanga.presentation.ui.fragments.main.anime.detailed

import com.example.domain.usecase.FetchAnimeUseCase
import com.example.domain.usecase.FetchGenresUseCase
import com.example.kitsuimanga.base.BaseViewModel
import com.example.kitsuimanga.presentation.models.anime.SingleAnimeUI
import com.example.kitsuimanga.presentation.models.anime.toUI
import com.example.kitsuimanga.presentation.models.genres.GenresListUi
import com.example.kitsuimanga.presentation.models.genres.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AnimeDetailedViewModel @Inject constructor(
    private val fetchAnimeUseCase: FetchAnimeUseCase,
    private val fetchGenresUseCase: FetchGenresUseCase,
) : BaseViewModel() {
    private val _animeDetailedState = mutableUiStateFlow<SingleAnimeUI>()
    var animeDetailedState = _animeDetailedState.asStateFlow()

    private val _animeGenresState = mutableUiStateFlow<GenresListUi>()
    var animeGenresState = _animeGenresState.asStateFlow()

    fun fetchADetailedAnime(id: String) =
        fetchAnimeUseCase(id).gatherRequest(_animeDetailedState) { it.toUI() }

    fun fetchGenres(id: String) =
        fetchGenresUseCase(id).gatherRequest(_animeGenresState) { it.toUI() }
}
package com.example.kitsuimanga.presentation.ui.fragments.main.anime

import com.example.data.repositories.AnimeRepositoryImpl
import com.example.kitsuimanga.base.BaseViewModel
import com.example.kitsuimanga.presentation.models.anime.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(
    private val animeRepositoryImpl: AnimeRepositoryImpl,
) : BaseViewModel() {

    fun fetchAnime() =
        animeRepositoryImpl.fetchPageAnime().collectPagingRequest {
            it.toUI()
        }
}
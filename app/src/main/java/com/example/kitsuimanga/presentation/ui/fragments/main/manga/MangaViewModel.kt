package com.example.kitsuimanga.presentation.ui.fragments.main.manga

import com.example.data.repositories.MangaRepositoryImpl
import com.example.kitsuimanga.base.BaseViewModel
import com.example.kitsuimanga.presentation.models.manga.toUI
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel

class MangaViewModel @Inject constructor(
    private val mangaRepositoryImpl: MangaRepositoryImpl,

    ) : BaseViewModel() {
    fun fetchManga() = mangaRepositoryImpl.fetchPageManga().gatherPagingRequest { it.toUI() }
}
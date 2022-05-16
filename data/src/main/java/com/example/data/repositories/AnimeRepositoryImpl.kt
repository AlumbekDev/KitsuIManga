package com.example.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.example.data.remote.apiservice.AnimeApiService
import com.example.data.remote.dtos.anime.toDomain
import com.example.data.remote.pagingsources.AnimePagingSource
import com.example.data.repositories.base.BaseRepository
import com.example.domain.repositories.AnimeRepository
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class AnimeRepositoryImpl @Inject constructor(
    private val animeApiService: AnimeApiService,
) : BaseRepository(), AnimeRepository {

    fun fetchPageAnime() =
        Pager(PagingConfig(pageSize = 20, initialLoadSize = 10)) {
            AnimePagingSource(animeApiService)
        }.flow.map { data -> data.map { it.toDomain() } }

    override fun fetchAnime(id: String) = sendRequest {
        animeApiService.fetchAnime(id).toDomain()
    }
}
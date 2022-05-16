package com.example.data.repositories

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.map
import com.example.data.remote.apiservice.MangaApiService
import com.example.data.remote.dtos.manga.toDomain
import com.example.data.remote.pagingsources.MangaPagingSource
import com.example.data.repositories.base.BaseRepository
import com.example.domain.repositories.MangaRepository
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class MangaRepositoryImpl @Inject constructor(
    private val mangaApiService: MangaApiService,
) : BaseRepository(), MangaRepository {

    fun fetchPageManga() = Pager(
        PagingConfig(
            pageSize = 20,
            initialLoadSize = 10
        )
    ) { MangaPagingSource(mangaApiService) }.flow.map { data -> data.map { it.toDomain() } }


    override fun fetchManga(id: String) = sendRequest {
        mangaApiService.fetchMangaes(id).toDomain()

    }
}
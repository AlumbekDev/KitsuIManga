package com.example.kitsuimanga.presentation.models.genres

import com.example.domain.models.genres.GenresList

data class GenresListUi(
    val data: List<DataItemUi>,
    val meta: MetaUi? = null,
    val links: LinksUi? = null,
)

fun GenresList.toUI() = GenresListUi(
    data.map { it.toUI() }, meta?.toUI(), links?.toUI()
)


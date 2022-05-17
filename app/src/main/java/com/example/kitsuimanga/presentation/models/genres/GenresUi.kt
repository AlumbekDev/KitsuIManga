package com.example.kitsuimanga.presentation.models.genres

import com.example.domain.models.genres.GenresModel

data class GenresUi(
    val data: List<DataItemUi>?,
    val meta: MetaUi,
    val links: LinksUi,
)

fun GenresModel.toUI() = GenresUi(data?.map { it.toUI() }, meta.toUI(), links.toUI())
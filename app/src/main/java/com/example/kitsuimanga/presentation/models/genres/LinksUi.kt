package com.example.kitsuimanga.presentation.models.genres

import com.example.domain.models.genres.LinksModel

data class LinksUi(
    val last: String?,
    val first: String?,
)

fun LinksModel.toUI() = LinksUi(last, first)
package com.example.kitsuimanga.presentation.models.manga

import com.example.domain.models.manga.LinksModel

data class LinksUI(
    val self: String,
)

fun LinksModel.toUI() = LinksUI(self)
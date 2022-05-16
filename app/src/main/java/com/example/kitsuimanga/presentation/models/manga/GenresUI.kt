package com.example.kitsuimanga.presentation.models.manga

import com.example.domain.models.manga.GenresModel

data class GenresUI(
    val links: LinksXUI,
)

fun GenresModel.toUI() = GenresUI(links.toUI())
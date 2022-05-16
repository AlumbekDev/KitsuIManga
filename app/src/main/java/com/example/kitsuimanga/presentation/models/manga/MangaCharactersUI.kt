package com.example.kitsuimanga.presentation.models.manga

import com.example.domain.models.manga.MangaCharactersModel

data class MangaCharactersUI(
    val links: LinksXXXXXXXXXUI,
)

fun MangaCharactersModel.toUI() =
    MangaCharactersUI(links.toUI())
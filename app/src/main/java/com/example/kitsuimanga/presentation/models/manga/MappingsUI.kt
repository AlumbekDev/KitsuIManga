package com.example.kitsuimanga.presentation.models.manga

import com.example.domain.models.manga.MappingsModel

data class MappingsUI(
    val links: LinksXXXXXUI,
)

fun MappingsModel.toUI() = MappingsUI(links.toUI())
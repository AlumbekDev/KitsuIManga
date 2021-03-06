package com.example.kitsuimanga.presentation.models.anime

import com.example.domain.models.anime.InstallmentsModel

data class InstallmentsUI(
    val links: LinksXXXXUI,
)

fun InstallmentsModel.toUI() = InstallmentsUI(links.toUI())
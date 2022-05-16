package com.example.kitsuimanga.presentation.models.manga

import com.example.domain.models.manga.CategoriesModel

data class CategoriesUI(
    val links: LinksXXUI,
)

fun CategoriesModel.toUI() = CategoriesUI(links.toUI())
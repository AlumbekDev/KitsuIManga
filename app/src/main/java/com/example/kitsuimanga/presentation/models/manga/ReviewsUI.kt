package com.example.kitsuimanga.presentation.models.manga

import com.example.domain.models.manga.ReviewsModel

data class ReviewsUI(
    val links:
    LinksXXXXXXUI,
)

fun ReviewsModel.toUI() = ReviewsUI(links.toUI())
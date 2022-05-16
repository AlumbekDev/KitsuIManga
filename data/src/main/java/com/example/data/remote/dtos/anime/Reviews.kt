package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.ReviewsModel
import com.google.gson.annotations.SerializedName

data class Reviews(
    @SerializedName("links")
    val links: LinksXXXXXX,
)

fun Reviews.toDomain() = ReviewsModel(links.toDomain())
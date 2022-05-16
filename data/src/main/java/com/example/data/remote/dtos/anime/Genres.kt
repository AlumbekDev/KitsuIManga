package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.GenresModel
import com.google.gson.annotations.SerializedName

data class Genres(
    @SerializedName("links")
    val links: LinksX,
)

fun Genres.toDomain() = GenresModel(
    links.toDomain()
)

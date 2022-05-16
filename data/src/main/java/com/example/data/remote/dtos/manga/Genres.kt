package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.GenresModel
import com.google.gson.annotations.SerializedName

data class Genres(
    @SerializedName("links")
    val links: LinksX,
)

fun Genres.toDomain() = GenresModel(links.toDomain())
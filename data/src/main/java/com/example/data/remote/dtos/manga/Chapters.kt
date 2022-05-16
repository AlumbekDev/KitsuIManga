package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.ChaptersModel
import com.google.gson.annotations.SerializedName

data class Chapters(
    @SerializedName("links")
    val links: LinksXXXXXXXX,
)

fun Chapters.toDomain() = ChaptersModel(
    links.toDomain()
)
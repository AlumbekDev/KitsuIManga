package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.MangaCharactersModel
import com.google.gson.annotations.SerializedName

data class MangaCharacters(
    @SerializedName("links")
    val links: LinksXXXXXXXXX,
)

fun MangaCharacters.toDomain() =
    MangaCharactersModel(links.toDomain())
package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.AnimeCharactersModel
import com.google.gson.annotations.SerializedName

data class AnimeCharacters(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXX
)

fun AnimeCharacters.toDomain() = AnimeCharactersModel(
    links.toDomain()
)
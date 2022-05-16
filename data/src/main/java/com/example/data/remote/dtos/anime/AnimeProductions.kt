package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.AnimeProductionsModel
import com.google.gson.annotations.SerializedName

data class AnimeProductions(
    @SerializedName("links")
    val links: LinksXXXXXXXXXX,
)

fun AnimeProductions.toDomain() = AnimeProductionsModel(

    links.toDomain()
)
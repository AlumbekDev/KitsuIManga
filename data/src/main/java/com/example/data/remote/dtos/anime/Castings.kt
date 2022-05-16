package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.CastingsModel
import com.google.gson.annotations.SerializedName

data class Castings(
    @SerializedName("links")
    val links: LinksXXX,
)

fun Castings.toDomain() = CastingsModel(
    links.toDomain()
)
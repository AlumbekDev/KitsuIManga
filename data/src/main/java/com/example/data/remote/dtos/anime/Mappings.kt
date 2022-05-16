package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.MappingsModel
import com.google.gson.annotations.SerializedName

data class Mappings(
    @SerializedName("links")
    val links: LinksXXXXX,
)

fun Mappings.toDomain() = MappingsModel(links.toDomain())
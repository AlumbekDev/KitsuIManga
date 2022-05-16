package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.LinksModel
import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self")
    val self: String,
)

fun Links.toDomain() = LinksModel(self)
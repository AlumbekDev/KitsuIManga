package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.LinksModel
import com.google.gson.annotations.SerializedName

data class Links(
    @SerializedName("self")
    val self: String,
)

fun Links.toDomain() = LinksModel(
    self
)
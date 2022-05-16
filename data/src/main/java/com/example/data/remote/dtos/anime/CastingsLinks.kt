package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.LinksXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXX.toDomain() = LinksXXXModel(
    self, related
)
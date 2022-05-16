package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.LinksXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXXXXX.toDomain() = LinksXXXXXXModel(
    self, related
)
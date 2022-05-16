package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.LinksXXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXXModel(
    self, related
)
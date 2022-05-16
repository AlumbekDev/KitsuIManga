package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.LinksXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXXX.toDomain() = LinksXXXXModel(
    self, related
)
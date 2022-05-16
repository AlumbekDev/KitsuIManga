package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.LinksXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXXXX.toDomain() = LinksXXXXXModel(
    self, related
)
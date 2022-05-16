package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.LinksXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXXXXXX.toDomain() = LinksXXXXXXXModel(
    self, related
)
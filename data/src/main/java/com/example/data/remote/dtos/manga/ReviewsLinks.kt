package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.LinksXXXXXXModel
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
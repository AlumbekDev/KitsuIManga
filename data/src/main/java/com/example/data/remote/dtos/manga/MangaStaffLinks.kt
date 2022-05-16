package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.LinksXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXModel(
    self, related
)
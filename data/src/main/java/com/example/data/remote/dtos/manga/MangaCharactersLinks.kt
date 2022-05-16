package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.LinksXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXX(
    @SerializedName("self")
    val self: String,
    @SerializedName("related")
    val related: String,
)

fun LinksXXXXXXXXX.toDomain() = LinksXXXXXXXXXModel(

    self, related
)
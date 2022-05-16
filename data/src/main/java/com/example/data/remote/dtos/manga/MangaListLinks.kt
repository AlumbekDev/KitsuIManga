package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.LinksXXXXXXXXXXXModel
import com.google.gson.annotations.SerializedName

data class LinksXXXXXXXXXXX(
    @SerializedName("first")
    val first: String,
    @SerializedName("prev")
    val prev: String?,
    @SerializedName("next")
    val next: String,
    @SerializedName("last")
    val last: String,
)

fun LinksXXXXXXXXXXX.toDomain() = LinksXXXXXXXXXXXModel(
    first, prev, next, last
)
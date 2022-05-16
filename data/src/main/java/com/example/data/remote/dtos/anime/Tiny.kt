package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.TinyModel
import com.google.gson.annotations.SerializedName

data class Tiny(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
)

fun Tiny.toDomain() = TinyModel(width, height)
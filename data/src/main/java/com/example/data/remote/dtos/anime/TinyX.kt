package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.TinyXModel
import com.google.gson.annotations.SerializedName

data class TinyX(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
)

fun TinyX.toDomain() = TinyXModel(width, height)
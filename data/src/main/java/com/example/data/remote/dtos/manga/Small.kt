package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.SmallModel
import com.google.gson.annotations.SerializedName

data class Small(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
)

fun Small.toDomain() = SmallModel(width, height)
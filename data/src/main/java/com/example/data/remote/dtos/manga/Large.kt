package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.LargeModel
import com.google.gson.annotations.SerializedName

data class Large(
    @SerializedName("width")
    val width: Int?,
    @SerializedName("height")
    val height: Int?,
)

fun Large.toDomain() = LargeModel(width, height)
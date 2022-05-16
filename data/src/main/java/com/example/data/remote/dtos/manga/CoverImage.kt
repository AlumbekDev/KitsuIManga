package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.CoverImageModel
import com.google.gson.annotations.SerializedName

data class CoverImage(
    @SerializedName("tiny")
    val tiny: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("large")
    val large: String,
    @SerializedName("original")
    val original: String,
    @SerializedName("meta")
    val meta: MetaX,
)

fun CoverImage.toDomain() = CoverImageModel(
    tiny, small, large, original, meta.toDomain()
)
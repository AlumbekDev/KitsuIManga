package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.PosterImageModel
import com.google.gson.annotations.SerializedName

data class PosterImage(
    @SerializedName("tiny")
    val tiny: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("medium")
    val medium: String,
    @SerializedName("large")
    val large: String,
    @SerializedName("original")
    val original: String,
    @SerializedName("meta")
    val meta: Meta,
)

fun PosterImage.toDomain() = PosterImageModel(
    tiny,
    small,
    medium,
    large,
    original,
    meta.toDomain()
)
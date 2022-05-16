package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.MetaModel
import com.google.gson.annotations.SerializedName

data class Meta(
    @SerializedName("dimensions")
    val dimensions: Dimensions,
)

fun Meta.toDomain() = MetaModel(dimensions.toDomain())
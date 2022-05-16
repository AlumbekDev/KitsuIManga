package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.MetaXModel
import com.google.gson.annotations.SerializedName

data class MetaX(
    @SerializedName("dimensions")
    val dimensions: DimensionsX,
)

fun MetaX.toDomain() = MetaXModel(
    dimensions.toDomain()
)
package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.MetaXModel
import com.google.gson.annotations.SerializedName

data class MetaX(
    @SerializedName("dimensions")
    val dimensions: DimensionsX,
)

fun MetaX.toDomain() = MetaXModel(
    dimensions.toDomain()
)
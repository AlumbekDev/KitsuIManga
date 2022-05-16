package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.MetaXXModel
import com.google.gson.annotations.SerializedName

data class MetaXX(
    @SerializedName("count")
    val count: Int,
)

fun MetaXX.toDomain() = MetaXXModel(
    count
)
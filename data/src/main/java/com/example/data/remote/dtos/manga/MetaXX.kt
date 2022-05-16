package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.MetaXXModel
import com.google.gson.annotations.SerializedName

data class MetaXX(
    @SerializedName("count")
    val count: Int,
)

fun MetaXX.toDomain() = MetaXXModel(count)
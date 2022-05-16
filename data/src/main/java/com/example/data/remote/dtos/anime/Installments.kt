package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.InstallmentsModel
import com.google.gson.annotations.SerializedName

data class Installments(
    @SerializedName("links")
    val links: LinksXXXX,
)

fun Installments.toDomain() = InstallmentsModel(
    links.toDomain()
)
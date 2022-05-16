package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.AnimeListModel
import com.google.gson.annotations.SerializedName

data class AnimeListDto(
    @SerializedName("data")
    val data: List<AnimeDataDto>,
    @SerializedName("meta")
    val meta: MetaXX? = null,
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXXX? = null,
)

fun AnimeListDto.toDomain() = AnimeListModel(
    data.map { it.toDomain() }, meta?.toDomain(), links?.toDomain()
)


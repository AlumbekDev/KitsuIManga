package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.SingleAnimeModel
import com.google.gson.annotations.SerializedName

data class SingleAnimeDto(
    @SerializedName("data")
    val data: AnimeDataDto,
)

fun SingleAnimeDto.toDomain() = SingleAnimeModel(data.toDomain())
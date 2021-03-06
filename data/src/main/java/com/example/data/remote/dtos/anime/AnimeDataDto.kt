package com.example.data.remote.dtos.anime

import com.example.data.remote.dtos.genres.AttributesDto
import com.example.data.remote.dtos.genres.toDomain
import com.example.domain.models.anime.AnimeDataModel
import com.google.gson.annotations.SerializedName

data class AnimeDataDto(
    @SerializedName("id")
    val id: String,
    @SerializedName("type")
    val type: String?,
    @SerializedName("links")
    val links: Links?,
    @SerializedName("attributes")
    val animeDto: AnimeDto,
    @SerializedName("relationships")
    val relationships: Relationships?,
)

fun AnimeDataDto.toDomain() = AnimeDataModel(
    id, type, links?.toDomain(), animeDto.toDomain(), relationships?.toDomain()
)
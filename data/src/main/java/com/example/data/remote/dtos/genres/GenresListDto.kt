package com.example.data.remote.dtos.genres

import com.example.domain.models.genres.GenresList
import com.google.gson.annotations.SerializedName

data class GenresListDto(
    @SerializedName("data")
    val data: List<DataItemDto>,
    @SerializedName("meta")
    val meta: MetaDto? = null,
    @SerializedName("links")
    val links: LinksDto? = null,
)

fun GenresListDto.toDomain() = GenresList(
    data.map { it.toDomain() }, meta?.toDomain(), links?.toDomain()
)


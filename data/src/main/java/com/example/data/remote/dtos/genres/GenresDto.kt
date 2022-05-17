package com.example.data.remote.dtos.genres

import com.example.domain.models.genres.GenresModel
import com.google.gson.annotations.SerializedName

data class GenresDto(
    @SerializedName("data")
    val data: List<DataItemDto>?,
    @SerializedName("meta")
    val meta: MetaDto,
    @SerializedName("links")
    val links: LinksDto,
)

fun GenresDto.toDomain() =
    GenresModel(data?.map { it.toDomain() }, meta.toDomain(), links.toDomain())
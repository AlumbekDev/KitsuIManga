package com.example.data.remote.dtos.genres

data class GenresDto(
    val data: List<DataItemDto>?,
    val meta: MetaDto,
    val links: LinksDto,
)
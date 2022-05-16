package com.example.data.remote.dtos.genres

data class DataItemDto(
    val links: LinksDto,
    val attributes: AttributesDto,
    val id: String = "",
    val type: String = "",
)
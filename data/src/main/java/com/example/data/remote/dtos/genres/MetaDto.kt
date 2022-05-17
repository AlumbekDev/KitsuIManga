package com.example.data.remote.dtos.genres

import com.example.domain.models.genres.MetaModel


data class MetaDto(val count: Int = 0)
fun MetaDto.toDomain() = MetaModel(count)
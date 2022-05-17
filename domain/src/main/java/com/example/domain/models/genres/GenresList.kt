package com.example.domain.models.genres

data class GenresList(
    val data: List<DataItemModels>,
    val meta: MetaModel? = null,
    val links: LinksModel? = null,
)


package com.example.kitsuimanga.presentation.models.manga

import com.example.domain.models.manga.MetaModel

data class MetaUI(
    val dimensionsModel: DimensionsUI,
)

fun MetaModel.toUI() = MetaUI(dimensionsModel.toUI())
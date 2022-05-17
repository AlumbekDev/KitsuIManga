package com.example.kitsuimanga.presentation.models.genres

import com.example.domain.models.genres.MetaModel

data class MetaUi(val count: Int = 0)

fun MetaModel.toUI() = MetaUi(count)
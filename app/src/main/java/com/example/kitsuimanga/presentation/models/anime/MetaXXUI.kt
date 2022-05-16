package com.example.kitsuimanga.presentation.models.anime

import com.example.domain.models.anime.MetaXXModel

data class MetaXXUI(
    val count: Int,
)

fun MetaXXModel.toUI() = MetaXXUI(count)
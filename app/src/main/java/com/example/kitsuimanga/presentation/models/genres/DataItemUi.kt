package com.example.kitsuimanga.presentation.models.genres

import com.example.domain.models.genres.DataItemModels
import com.example.kitsuimanga.base.BaseDiffModel

data class DataItemUi(
    val links: LinksUi,
    val attributes: AttributesUi,
    override val id: String,
    val type: String,
) : BaseDiffModel

fun DataItemModels.toUI() = DataItemUi(links.toUI(), attributes.toUI(), id, type)
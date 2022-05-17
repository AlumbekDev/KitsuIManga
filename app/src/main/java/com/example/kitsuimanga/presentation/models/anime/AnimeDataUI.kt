package com.example.kitsuimanga.presentation.models.anime

import com.example.domain.models.anime.AnimeDataModel
import com.example.kitsuimanga.base.BaseDiffModel
import com.example.kitsuimanga.presentation.models.genres.AttributesUi
import com.example.kitsuimanga.presentation.models.genres.toUI

data class AnimeDataUI(
    override val id: String,
    val type: String?,
    val links: LinksUI?,
    val animeDto: AnimeUI,
    val relationships: RelationshipsUI?,
) : BaseDiffModel

fun AnimeDataModel.toUI() =
    AnimeDataUI(id, type, links?.toUI(), animeDto.toUI(), relationships?.toUI())
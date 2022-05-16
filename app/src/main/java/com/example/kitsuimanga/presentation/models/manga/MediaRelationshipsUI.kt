package com.example.kitsuimanga.presentation.models.manga

import com.example.domain.models.manga.MediaRelationshipsModel

data class MediaRelationshipsUI(
    val links: LinksXXXXXXXUI,
)

fun MediaRelationshipsModel.toUI() =
    MediaRelationshipsUI(links.toUI())
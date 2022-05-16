package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.MediaRelationshipsModel
import com.google.gson.annotations.SerializedName

data class MediaRelationships(
    @SerializedName("links")
    val links: LinksXXXXXXX,
)

fun MediaRelationships.toDomain() =
    MediaRelationshipsModel(
        links.toDomain()
    )
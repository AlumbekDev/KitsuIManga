package com.example.data.remote.dtos.manga

import com.example.domain.models.manga.MediaRelationshipsModel
import com.google.gson.annotations.SerializedName

data class MediaRelationships(
    @SerializedName("links")
    val links: LinksXXXXXXX,
)

fun MediaRelationships.toDomain() =
    MediaRelationshipsModel(links.toDomain())
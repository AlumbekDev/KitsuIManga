package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.StreamingLinksModel
import com.google.gson.annotations.SerializedName

data class StreamingLinks(
    @SerializedName("links")
    val links: LinksXXXXXXXXX,
)

fun StreamingLinks.toDomain() = StreamingLinksModel(links.toDomain())
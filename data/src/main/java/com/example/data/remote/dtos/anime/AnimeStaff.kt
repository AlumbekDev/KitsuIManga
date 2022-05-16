package com.example.data.remote.dtos.anime

import com.example.domain.models.anime.AnimeStaffModel
import com.google.gson.annotations.SerializedName

data class AnimeStaff(
    @SerializedName("links")
    val links: LinksXXXXXXXXXXXX,
)

fun AnimeStaff.toDomain() = AnimeStaffModel(
    links.toDomain()
)
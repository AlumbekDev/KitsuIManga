package com.example.data.remote.dtos.genres

import com.google.gson.annotations.SerializedName

data class AttributesDto(
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("updatedAt")
    val updatedAt: String,
)
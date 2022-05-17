package com.example.data.remote.dtos.genres

import com.google.gson.annotations.SerializedName

data class LinksDto(
    @SerializedName("last")
    val last: String,
    @SerializedName("first")
    val first: String,
)
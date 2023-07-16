package com.example.api_consumer

import android.media.Image
import com.google.gson.annotations.SerializedName

data class dogResponse (
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>,
)
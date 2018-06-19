package my.demo.app6.model

import com.squareup.moshi.Json

data class Business(val name: String, @Json(name = "image_url") val imageUrl: String)
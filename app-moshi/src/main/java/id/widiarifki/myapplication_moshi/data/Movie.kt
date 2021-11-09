package id.widiarifki.myapplication_moshi.data

import com.squareup.moshi.Json

data class Movie(
    var id: Int?,

    @Json(name = "original_title")
    var title: String?,
)
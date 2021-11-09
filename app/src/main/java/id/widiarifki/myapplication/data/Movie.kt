package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class Movie(
    var id: Int?,

    @SerializedName("original_title")
    var title: String?,
)
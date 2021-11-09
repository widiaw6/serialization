package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class Bank(
    @SerializedName("internalId") var internalId: String,
    @SerializedName("name") var name: String
)

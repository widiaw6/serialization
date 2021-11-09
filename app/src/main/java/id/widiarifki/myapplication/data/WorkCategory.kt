package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

class WorkCategory(
    @SerializedName("internalId") var internalId: String,
    @SerializedName("name") var name: String,
    @SerializedName("label") var label: String
)
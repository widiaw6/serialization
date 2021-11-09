package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class CompanyFileCategory(
    @SerializedName("internalId") var internalId: String,
    @SerializedName("name") var name: String,
    @SerializedName("label") var label: String,
    @SerializedName("isRequired") var isRequired: Boolean
)
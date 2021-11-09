package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class CompanyDataCategory(
    @SerializedName("name") var name: String?,
    @SerializedName("label") var label: String?
)

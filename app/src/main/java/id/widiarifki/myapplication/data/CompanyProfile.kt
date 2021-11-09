package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class CompanyProfile(
    @SerializedName("internalId") var internalId: String,
    @SerializedName("fileUrl") var fileUrl: String?,
    @SerializedName("fileSignedUrl") var fileSignedUrl: String?,
    @SerializedName("isVerified") var isVerified: Boolean?
)

package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class CompanyData(
    @SerializedName("internalId") var internalId: String?,
    @SerializedName("companyDataCategory") var companyDataCategory: CompanyDataCategory?,
    @SerializedName("dataValue") var dataValue: String?,
    @SerializedName("isVerified") var isVerified: String?,
    @SerializedName("rejectNote") var rejectNote: String?,
    @SerializedName("companyDataCategoryName") var companyDataCategoryName: String?
)

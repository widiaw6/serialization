package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class PhoneModel(
    @SerializedName("dialCode") var dialCode: String,
    @SerializedName("phone") var phoneNumber: String,
    @SerializedName("companyPhoneIid") var companyPhoneIid: String = "",
    @SerializedName("internalId") var internalId: String = "",
    @SerializedName("isDeleted") var isDeleted: Boolean = false
)

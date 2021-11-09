package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class PhoneModel(
    @Json(name = "dialCode") var dialCode: String,
    @Json(name = "phone") var phoneNumber: String,
    @Json(name = "companyPhoneIid") var companyPhoneIid: String = "",
    @Json(name = "internalId") var internalId: String = "",
    @Json(name = "isDeleted") var isDeleted: Boolean = false
)

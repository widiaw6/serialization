package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class CompanyFileCategory(
    @Json(name = "internalId") var internalId: String,
    @Json(name = "name") var name: String,
    @Json(name = "label") var label: String,
    @Json(name = "isRequired") var isRequired: Boolean
)
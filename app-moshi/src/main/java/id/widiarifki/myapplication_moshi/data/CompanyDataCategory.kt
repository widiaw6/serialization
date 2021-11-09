package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class CompanyDataCategory(
    @Json(name = "name") var name: String?,
    @Json(name = "label") var label: String?
)

package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class ItemCategory(
    @Json(name = "internalId") var internalId: String,
    @Json(name = "name") var name: String?,
    @Json(name = "label") var label: String?
)


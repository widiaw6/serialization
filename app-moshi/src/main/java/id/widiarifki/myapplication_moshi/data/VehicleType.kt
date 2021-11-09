package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class VehicleType(
    @Json(name = "internalId") var internalId: String?,
    @Json(name = "name") var name: String
)

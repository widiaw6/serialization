package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class OwnedVehicleType(
    @Json(name = "vehicleModelType") var vehicleTypeModel: VehicleType?,
    @Json(name = "amountVehicle") var qty: Int,
    @Json(name = "vehicleModelIid") var vehicleModelInternalId: String
)
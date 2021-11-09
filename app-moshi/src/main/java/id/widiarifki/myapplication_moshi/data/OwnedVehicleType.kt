package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class OwnedVehicleType(
    @Json(name = "vehicleModelType") var vehicleTypeModel: VehicleType?,
    @Json(name = "amountVehicle") var qty: Int,
    @Json(name = "vehicleModelIid") var vehicleModelInternalId: String
)
package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class OwnedVehicleType(
    @SerializedName("vehicleModelType") var vehicleTypeModel: VehicleType?,
    @SerializedName("amountVehicle") var qty: Int,
    @SerializedName("vehicleModelIid") var vehicleModelInternalId: String
)
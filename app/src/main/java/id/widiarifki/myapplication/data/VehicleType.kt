package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class VehicleType(
    @SerializedName("internalId") var internalId: String?,
    @SerializedName("name") var name: String
)

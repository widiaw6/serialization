package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class MenuStepper(
    @SerializedName("internalId") var internalId: String,
    @SerializedName("name") var name: String,
    @SerializedName("sequenceStep") var sequenceStep: Int?
)

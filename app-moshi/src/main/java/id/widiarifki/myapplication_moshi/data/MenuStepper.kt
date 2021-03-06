package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class MenuStepper(
    @Json(name = "internalId") var internalId: String,
    @Json(name = "name") var name: String,
    @Json(name = "sequenceStep") var sequenceStep: Int?
)

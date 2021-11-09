package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class Bank(
    @Json(name = "internalId") var internalId: String,
    @Json(name = "name") var name: String
)

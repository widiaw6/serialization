package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ChildAccount(
    @Json(name = "email") var email: String?,
    @Json(name = "name") var name: String?,
    @Json(name = "jobPosition") var jobPosition: String?
)
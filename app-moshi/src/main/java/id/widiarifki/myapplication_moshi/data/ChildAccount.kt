package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class ChildAccount(
    @Json(name = "email") var email: String?,
    @Json(name = "name") var name: String?,
    @Json(name = "jobPosition") var jobPosition: String?
)
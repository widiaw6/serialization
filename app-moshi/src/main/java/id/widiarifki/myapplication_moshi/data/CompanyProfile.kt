package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CompanyProfile(
    @Json(name = "internalId") var internalId: String,
    @Json(name = "fileUrl") var fileUrl: String?,
    @Json(name = "fileSignedUrl") var fileSignedUrl: String?,
    @Json(name = "isVerified") var isVerified: Boolean?
)

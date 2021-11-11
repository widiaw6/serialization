package id.widiarifki.myapplication_moshi.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Attachment(
    @Json(name = "internalId") var internalId: String,
    @Json(name = "fileName") var fileName: String?,
    @Json(name = "fileExtension") var fileExtension: String?,
    @Json(name = "fileCategoryLabel") var fileCategoryLabel: String?,
    @Json(name = "fileCategory") var fileCategory: String?,
    @Json(name = "categoryLabel") var categoryLabel: String?,
    @Json(name = "category") var category: String?,
    @Json(name = "fileSize") var fileSize: String?,
    @Json(name = "fileUrl") var fileUrl: String?,
    @Json(name = "fileSignedUrl") var fileSignedUrl: String?,
    @Json(name = "thumbnailFileUrl") var thumbnailFileUrl: String?,
    @Json(name = "companyFileCategory") var fileCategoryModel: CompanyFileCategory?,
    @Json(name = "vehicleFileCategory") var vehicleFileCategory: CompanyFileCategory?,
    @Json(name = "accountFileCategory") var accountFileCategory: String?,
    @Json(name = "isVerified") var isVerified: Boolean?,
    @Json(name = "mimeType") var mimeType: String?,
    @Json(name = "source") val source: String?,
    @Json(name = "rejectNote") val rejectNote: String?,
    @Json(name = "bankAccountFileCategory") val bankAccountFileCategory: BankAccountFileCategory?
)

package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class Attachment(
    @SerializedName("internalId") var internalId: String,
    @SerializedName("fileName") var fileName: String?,
    @SerializedName("fileExtension") var fileExtension: String?,
    @SerializedName("fileCategoryLabel") var fileCategoryLabel: String?,
    @SerializedName("fileCategory") var fileCategory: String?,
    @SerializedName("categoryLabel") var categoryLabel: String?,
    @SerializedName("category") var category: String?,
    @SerializedName("fileSize") var fileSize: String?,
    @SerializedName("fileUrl") var fileUrl: String?,
    @SerializedName("fileSignedUrl") var fileSignedUrl: String?,
    @SerializedName("thumbnailFileUrl") var thumbnailFileUrl: String?,
    @SerializedName("companyFileCategory") var fileCategoryModel: CompanyFileCategory?,
    @SerializedName("vehicleFileCategory") var vehicleFileCategory: CompanyFileCategory?,
    @SerializedName("accountFileCategory") var accountFileCategory: String?,
    @SerializedName("isVerified") var isVerified: Boolean?,
    @SerializedName("mimeType") var mimeType: String?,
    @SerializedName("source") val source: String?,
    @SerializedName("rejectNote") val rejectNote: String?,
    @SerializedName("bankAccountFileCategory") val bankAccountFileCategory: BankAccountFileCategory?
)

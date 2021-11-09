package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class CompanyData(
    @Json(name = "internalId") var internalId: String?,
    @Json(name = "companyDataCategory") var companyDataCategory: CompanyDataCategory?,
    @Json(name = "dataValue") var dataValue: String?,
    @Json(name = "isVerified") var isVerified: String?,
    @Json(name = "rejectNote") var rejectNote: String?,
    @Json(name = "companyDataCategoryName") var companyDataCategoryName: String?
)

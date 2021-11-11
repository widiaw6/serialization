package id.widiarifki.myapplication_moshi.data.network.response

import com.squareup.moshi.JsonClass
import id.widiarifki.myapplication_moshi.data.Company

@JsonClass(generateAdapter = true)
data class CompanyListResponse(
    val accountVendors: List<Company>
)
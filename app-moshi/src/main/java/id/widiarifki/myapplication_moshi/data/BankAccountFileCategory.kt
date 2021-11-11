package id.widiarifki.myapplication_moshi.data

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BankAccountFileCategory(
    val id: String?,
    val label: String?,
    val name: String?
)

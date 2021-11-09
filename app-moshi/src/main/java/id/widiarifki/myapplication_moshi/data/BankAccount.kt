package id.widiarifki.myapplication_moshi.data
import com.squareup.moshi.Json

data class BankAccount(
    @Json(name = "internalId") var internalId: String,
    @Json(name = "name") var name: String,
    @Json(name = "number") var number: String,
    @Json(name = "files") var attachments: List<Attachment>,
    @Json(name = "bank") var bank: Bank,
    @Json(name = "bankAccountFiles") var files: List<Attachment>,
    @Json(name = "bankIid") var bankIid: String,
    @Json(name = "isPrimary") var isPrimary: Boolean
)

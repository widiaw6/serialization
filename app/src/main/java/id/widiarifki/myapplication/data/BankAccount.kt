package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class BankAccount(
    @SerializedName("internalId") var internalId: String,
    @SerializedName("name") var name: String,
    @SerializedName("number") var number: String,
    @SerializedName("files") var attachments: List<Attachment>,
    @SerializedName("bank") var bank: Bank,
    @SerializedName("bankAccountFiles") var files: List<Attachment>,
    @SerializedName("bankIid") var bankIid: String,
    @SerializedName("isPrimary") var isPrimary: Boolean
)

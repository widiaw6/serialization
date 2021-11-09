package id.widiarifki.myapplication.data

import com.google.gson.annotations.SerializedName

data class ChildAccount(
    @SerializedName("email") var email: String?,
    @SerializedName("name") var name: String?,
    @SerializedName("jobPosition") var jobPosition: String?
)
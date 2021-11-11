package id.widiarifki.myapplication_moshi.data.network.response

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BaseResponse<T> (
    var statusCode: Int? = null,
    var data: T? = null
)

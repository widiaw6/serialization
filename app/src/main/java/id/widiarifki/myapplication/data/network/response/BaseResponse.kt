package id.widiarifki.myapplication.data.network.response

data class BaseResponse<T> (
    var statusCode: Int? = null,
    var data: T? = null
)

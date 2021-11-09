package id.widiarifki.myapplication_moshi.data.network.response

data class ListResponse<T>(
    var page: Int? = null,
    var results: List<T>? = null,
    var total_pages: Int? = null,
    var total_results: Int? = null
)
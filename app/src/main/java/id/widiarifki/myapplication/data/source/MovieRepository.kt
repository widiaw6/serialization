package id.widiarifki.myapplication.data.source

import id.widiarifki.myapplication.data.Movie
import id.widiarifki.myapplication.data.network.APIService
import id.widiarifki.myapplication.data.network.response.ListResponse

class MovieRepository(
    private val apiService: APIService = APIService.getInstance()
) {

    suspend fun getMovies(page: Int): ListResponse<Movie> {
        return apiService.getMovies(page)
    }

    companion object {
        @Volatile
        private var INSTANCE : MovieRepository? = null

        @Synchronized
        fun getInstance(): MovieRepository {
            return INSTANCE ?: MovieRepository().apply {
                INSTANCE = this
            }
        }
    }
}
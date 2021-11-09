package id.widiarifki.myapplication_moshi.data.network

import id.widiarifki.myapplication_moshi.data.Movie
import id.widiarifki.myapplication_moshi.data.network.response.ListResponse
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("discover/movie")
    suspend fun getMovies(
        @Query("page") page: Int
    ): ListResponse<Movie>

    companion object {
        private const val BASE_URL = "https://api.themoviedb.org/3/"
        private const val API_KEY = "eaf558fb32f6cca8a061d3bb16f441a1"
        @Volatile
        private var INSTANCE: APIService? = null

        @Synchronized
        fun getInstance(): APIService {
            return INSTANCE ?: run {
                val httpClient = OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    })
                    .addNetworkInterceptor(object: Interceptor {
                        override fun intercept(chain: Interceptor.Chain): Response {
                            val modifiedUrl = chain.request().url.newBuilder()
                                .addQueryParameter("api_key", API_KEY)
                                .build()

                            val modifiedRequest = chain.request().newBuilder()
                                .url(modifiedUrl)
                                .build()

                            return chain.proceed(modifiedRequest)
                        }
                    })
                    .build()

                INSTANCE = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(MoshiConverterFactory.create())
                    .client(httpClient)
                    .build()
                    .create(APIService::class.java)

                return INSTANCE!!
            }
        }
    }
}
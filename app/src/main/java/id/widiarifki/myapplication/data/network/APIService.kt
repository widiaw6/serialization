package id.widiarifki.myapplication.data.network

import id.widiarifki.myapplication.data.Movie
import id.widiarifki.myapplication.data.network.response.ListResponse
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface APIService {

    @GET("discover/movie")
    suspend fun getMovies(
        @Query("page") page: Int
    ): ListResponse<Movie>

    companion object {
        private const val BASE_URL = "https://dev02-gql.waresix.com/graphql"
        private const val JWT_TOKEN = "eaf558fb32f6cca8a061d3bb16f441a1"
        @Volatile
        private var INSTANCE: APIService? = null

        @Synchronized
        fun getInstance(): APIService {
            return INSTANCE ?: run {
                val httpClient = OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    })
                    .addInterceptor { chain ->
                        val newRequest = chain.request().newBuilder()
                            .addHeader("Authorization", "Basic dzY6c3VwZXJoZXJvZXM=")
                            .addHeader("X-Authorization", "JWT $JWT_TOKEN")
                            .addHeader("Content-Type", "application/json")
                            .build()
                        chain.proceed(newRequest)
                    }
                    /*.addNetworkInterceptor(object: Interceptor {
                        override fun intercept(chain: Interceptor.Chain): Response {
                            val modifiedUrl = chain.request().url.newBuilder()
                                .addQueryParameter("api_key", API_KEY)
                                .build()

                            val modifiedRequest = chain.request().newBuilder()
                                .url(modifiedUrl)
                                .build()

                            return chain.proceed(modifiedRequest)
                        }
                    })*/
                    .build()

                INSTANCE = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GitHuntConverter.create(CoreConfig.context))
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient)
                    .build()
                    .create(APIService::class.java)

                return INSTANCE!!
            }
        }
    }
}
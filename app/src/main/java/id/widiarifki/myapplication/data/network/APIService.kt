package id.widiarifki.myapplication.data.network

import id.widiarifki.myapplication.data.Company
import id.widiarifki.myapplication.data.network.response.BaseResponse
import id.widiarifki.myapplication.data.network.response.CompanyListResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface APIService {

    @GET("companies.json")
    suspend fun getCompanies(): BaseResponse<CompanyListResponse>

    @GET("company.json")
    suspend fun getSingleCompany(): BaseResponse<Company>

    companion object {
        private const val BASE_URL = "https://raw.githubusercontent.com/widiaw6/serialization/dev-moshi/_sample/"

        @Volatile
        private var INSTANCE: APIService? = null

        @Synchronized
        fun getInstance(): APIService {
            return INSTANCE ?: run {
                val httpClient = OkHttpClient.Builder()
                    .addInterceptor(HttpLoggingInterceptor().apply {
                        level = HttpLoggingInterceptor.Level.BODY
                    })
                    .build()

                INSTANCE = Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(httpClient)
                    .build()
                    .create(APIService::class.java)

                return INSTANCE!!
            }
        }
    }
}
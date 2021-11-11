package id.widiarifki.myapplication_moshi.data.network

import com.squareup.moshi.Moshi
import id.widiarifki.myapplication_moshi.data.Company
import id.widiarifki.myapplication_moshi.data.network.response.BaseResponse
import id.widiarifki.myapplication_moshi.data.network.response.CompanyListResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET

interface APIService {

    @GET("companies.json")
    suspend fun getCompanies(): BaseResponse<CompanyListResponse>

    @GET("company.json")
    suspend fun getSingleCompany(): BaseResponse<Company>

    companion object {
        private const val BASE_URL = "https://raw.githubusercontent.com/widiaw6/serialization/master/_sample/"

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
                    .addConverterFactory(MoshiConverterFactory.create(Moshi.Builder().build()))
                    .client(httpClient)
                    .build()
                    .create(APIService::class.java)

                return INSTANCE!!
            }
        }
    }
}
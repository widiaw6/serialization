package id.widiarifki.myapplication_moshi.data.source

import id.widiarifki.myapplication_moshi.data.Company
import id.widiarifki.myapplication_moshi.data.network.APIService
import id.widiarifki.myapplication_moshi.data.network.response.BaseResponse
import id.widiarifki.myapplication_moshi.data.network.response.CompanyListResponse

class CompanyRepository(
    private val apiService: APIService = APIService.getInstance()
) {

    suspend fun getCompanies(): BaseResponse<CompanyListResponse> {
        return apiService.getCompanies()
    }

    suspend fun getCompany(): BaseResponse<Company> {
        return apiService.getSingleCompany()
    }

    companion object {
        @Volatile
        private var INSTANCE : CompanyRepository? = null

        @Synchronized
        fun getInstance(): CompanyRepository {
            return INSTANCE ?: CompanyRepository().apply {
                INSTANCE = this
            }
        }
    }
}
package id.widiarifki.myapplication.data.source

import id.widiarifki.myapplication.data.Company
import id.widiarifki.myapplication.data.network.APIService
import id.widiarifki.myapplication.data.network.response.BaseResponse
import id.widiarifki.myapplication.data.network.response.CompanyListResponse

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
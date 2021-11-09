package id.widiarifki.myapplication_moshi.presentation.company.list

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import id.widiarifki.myapplication_moshi.data.Company
import id.widiarifki.myapplication_moshi.data.source.CompanyRepository
import kotlinx.coroutines.launch

class CompanyListViewModel(
    private val repository: CompanyRepository = CompanyRepository.getInstance()
) : ViewModel() {

    private val _companies: MutableLiveData<List<Company>> = MutableLiveData(emptyList())
    val companies: LiveData<List<Company>> = _companies

    init {
        viewModelScope.launch {
            getCompanies()
        }
    }

    private suspend fun getCompanies() {
        try {
            val result = repository.getCompanies()
            _companies.value = result.data?.accountVendors ?: emptyList()
        } catch (e: Exception) {
            throw Exception(e.message)
        }
    }
}

package id.widiarifki.myapplication_moshi.presentation.company.list

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import id.widiarifki.myapplication_moshi.databinding.ActivityCompanyListBinding

class CompanyListActivity : AppCompatActivity() {

    private val viewModel: CompanyListViewModel by viewModels()
    private lateinit var binding: ActivityCompanyListBinding
    private val companyAdapter = CompanyAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCompanyListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecyclerView()
        observeData()
    }

    private fun observeData() {
        viewModel.companies.observe(this) {
            companyAdapter.companies = it
        }
    }

    private fun setupRecyclerView() {
        binding.rvCompany.apply {
            adapter = companyAdapter
        }
    }
}
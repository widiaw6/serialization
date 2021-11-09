package id.widiarifki.myapplication_moshi.presentation.company.list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.widiarifki.myapplication_moshi.data.Company
import id.widiarifki.myapplication_moshi.databinding.ItemCompanyBinding

class CompanyAdapter : RecyclerView.Adapter<CompanyAdapter.ViewHolder>() {

    var companies: List<Company> = emptyList()
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemCompanyBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindItem(companies[position])
    }

    override fun getItemCount(): Int = companies.size

    class ViewHolder(private val viewBinding: ItemCompanyBinding) :
        RecyclerView.ViewHolder(viewBinding.root) {

        fun bindItem(company: Company) = with(viewBinding) {
            tvName.text = company.name
        }
    }

}

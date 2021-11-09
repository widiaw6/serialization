package id.widiarifki.myapplication_moshi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import id.widiarifki.myapplication_moshi.data.Movie
import id.widiarifki.myapplication_moshi.databinding.ItemMovieBinding

class MovieAdapter : PagingDataAdapter<Movie, MovieAdapter.ItemHolder>(ItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
        val binding = ItemMovieBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        val movie = getItem(position)
        holder.bind(movie)
    }

    class ItemHolder(private val viewBinding: ItemMovieBinding) : RecyclerView.ViewHolder(viewBinding.root) {
        fun bind(movie: Movie?) = with(viewBinding) {
            tvMovieName.text = movie?.title
        }
    }

    class ItemDiffCallback: DiffUtil.ItemCallback<Movie>() {
        override fun areItemsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(oldItem: Movie, newItem: Movie): Boolean {
            return oldItem == newItem
        }
    }
}

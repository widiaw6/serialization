package id.widiarifki.myapplication

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import id.widiarifki.myapplication.databinding.ActivityMovieBinding
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch

class MovieActivity : AppCompatActivity() {

    private val viewModel: MovieViewModel by viewModels()
    private lateinit var binding: ActivityMovieBinding
    private val movieAdapter = MovieAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMovieBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setupRecyclerView()
        observeData()
    }

    private fun observeData() {
        lifecycleScope.launch {
            viewModel.movies.collectLatest {
                movieAdapter.submitData(it)
            }
        }
    }

    private fun setupRecyclerView() {
        binding.rvMovies.apply {
            adapter = movieAdapter
        }
    }
}
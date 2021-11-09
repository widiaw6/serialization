package id.widiarifki.myapplication

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import id.widiarifki.myapplication.data.Movie
import id.widiarifki.myapplication.data.source.MoviePagingSource
import kotlinx.coroutines.flow.Flow

class MovieViewModel : ViewModel() {

    val movies: Flow<PagingData<Movie>> by lazy {
        Pager(
            config = PagingConfig(pageSize = 20, enablePlaceholders = false),
            pagingSourceFactory = { MoviePagingSource() }
        ).flow.cachedIn(viewModelScope)
    }

}
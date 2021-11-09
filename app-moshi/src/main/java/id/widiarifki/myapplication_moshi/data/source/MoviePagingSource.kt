package id.widiarifki.myapplication_moshi.data.source

import androidx.paging.PagingSource
import androidx.paging.PagingState
import id.widiarifki.myapplication_moshi.data.Movie

class MoviePagingSource(
    private val repository: MovieRepository = MovieRepository.getInstance()
) : PagingSource<Int, Movie>(){

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Movie> {
        val page = params.key ?: 1
        return try {
            val response = repository.getMovies(page)
            val movies = response.results.orEmpty()

            LoadResult.Page(
                data = movies,
                prevKey = null,
                nextKey = if (movies.isEmpty()) null else page+1
            )
        } catch (exception: Exception) {
            LoadResult.Error(exception)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Movie>): Int? {
        return state.anchorPosition?.let {
            state.closestPageToPosition(it)?.prevKey?.plus(1)
                ?: state.closestPageToPosition(it)?.nextKey?.minus(1)
        }
    }
}

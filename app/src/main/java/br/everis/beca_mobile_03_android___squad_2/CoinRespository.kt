package br.everis.beca_mobile_03_android___squad_2

import br.everis.beca_mobile_03_android___squad_2.api.CoinApi
import br.everis.beca_mobile_03_android___squad_2.api.CoinService.Companion.API_KEY
import br.everis.beca_mobile_03_android___squad_2.api.CoinService.Companion.retrofit
import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin

class CoinRespository {

    fun getMovies(): List<CryptoCoin> {
        val moviesService = retrofit.create(CoinApi::class.java)
        val result = moviesService?.getMovies(API_KEY)?.execute()
        val moviesList: ArrayList<CryptoCoin> = arrayListOf()
        if (result != null && result.isSuccessful) {
            result.body()?.results?.forEach { moviesResponse ->
                val movies = CryptoCoin()
                movies.title = moviesResponse.title ?: ""
                movies.posterPath = moviesResponse.posterPath ?: ""
                movies.backdropPath = moviesResponse.backdropPath ?: ""
                movies.overview = moviesResponse.overview ?: ""
                movies.releaseDate = moviesResponse.releaseDate?: ""
                movies.voteAverage = moviesResponse.voteAverage ?: ""
                movies.popularity = moviesResponse.popularity ?: ""
                moviesList.add(movies)
            }
        }
        return moviesList
    }
}
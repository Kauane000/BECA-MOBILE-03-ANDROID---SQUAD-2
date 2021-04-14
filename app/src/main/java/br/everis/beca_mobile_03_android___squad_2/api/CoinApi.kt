package br.everis.beca_mobile_03_android___squad_2.api

import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface CoinApi {

    @GET("assets")
    fun getAllListCoin(@Query("apiKey") api: String): Call<CryptoCoin>

}
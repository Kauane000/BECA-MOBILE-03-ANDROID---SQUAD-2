package br.everis.beca_mobile_03_android___squad_2.api

import br.everis.beca_mobile_03_android___squad_2.api.CoinService.Companion.API_KEY
import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface CoinApi {

    @GET("v1/assets")
    fun getListCoin(@Query("apiKey") api: String = API_KEY ): Call<List<CryptoCoin>>
}
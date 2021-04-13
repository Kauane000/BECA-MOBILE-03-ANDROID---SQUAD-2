package br.everis.beca_mobile_03_android___squad_2.api

import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface CoinApi {

    @GET("assets?apiKey=CFB9107C-F454-4F93-B412-C7F15E3D284D")
    fun getAllListCoin(): Call<CryptoCoin>

}
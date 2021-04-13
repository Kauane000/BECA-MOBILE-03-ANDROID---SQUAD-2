package br.everis.beca_mobile_03_android___squad_2.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CoinRestApi {

    companion object{
        const val BASE_URL = "http://rest-sandbox.coinapi.io/"

        private fun ConioProvider(): Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        fun coinRetrofitApi(): CoinApi = ConioProvider().create(CoinApi::class.java)
    }
}
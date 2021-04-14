package br.everis.beca_mobile_03_android___squad_2.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CoinService {

    companion object{
        const val BASE_URL = "http://rest-sandbox.coinapi.io/"
        const val API_KEY = "CFB9107C-F454-4F93-B412-C7F15E3D284D"

        var retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

       // fun coinRetrofitApi(): CoinApi = ConioProvider().create(CoinApi::class.java)
    }
}
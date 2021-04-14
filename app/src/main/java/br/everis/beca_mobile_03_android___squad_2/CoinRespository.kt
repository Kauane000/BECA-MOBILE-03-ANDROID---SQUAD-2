package br.everis.beca_mobile_03_android___squad_2

import br.everis.beca_mobile_03_android___squad_2.api.CoinApi
import br.everis.beca_mobile_03_android___squad_2.api.CoinService.Companion.API_KEY
import br.everis.beca_mobile_03_android___squad_2.api.CoinService.Companion.retrofit
import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin


class CoinRespository {

    fun getCoin(): List<CryptoCoin> {
        val coinService = retrofit.create(CoinApi::class.java)
        val result = coinService?.getListCoin(API_KEY)?.execute()
        val coinList: ArrayList<CryptoCoin> = arrayListOf()
        if (result != null && result.isSuccessful) {
            result.body()?.listCoin.forEach{ coinResponse ->
                val coin = CryptoCoin()
                coin.assetId = coinResponse.asset_id ?: ""
                coin.name = coinResponse.name ?: ""
                coin.typeCrypto = coinResponse.type_is_crypto ?: ""
                coin.volumeHour = coinResponse.volume_1hrs_usd ?: ""
                coin.volumeDay = coinResponse.volume_1day_usd?: ""
                coin.volumeMonth = coinResponse.volume_1mth_usd ?: ""
                coin.idIcon = coinResponse.id_icon ?: ""
                coin.priceUsd = coinResponse.price_usd ?: ""
                coinList.add(coin)
            }
        }
        return coinList
    }
}

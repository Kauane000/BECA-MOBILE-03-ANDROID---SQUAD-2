package br.everis.beca_mobile_03_android___squad_2

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.everis.beca_mobile_03_android___squad_2.api.CoinApi
import br.everis.beca_mobile_03_android___squad_2.api.CoinRestApi
import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin
import retrofit2.Call
import retrofit2.Response

class MainViewModel: ViewModel() {
    private val coinLiveData: MutableLiveData<CoinApi> = MutableLiveData()

    fun listConio(): MutableLiveData<CoinApi>{
        val call = CoinRestApi.coinRetrofitApi().getAllListCoin("CFB9107C-F454-4F93-B412-C7F15E3D284D")

        call.enqueue(object : retrofit2.Callback<CryptoCoin> {
            override fun onResponse(call: Call<CryptoCoin>, response: Response<CryptoCoin>) {
                if (response.isSuccessful) {
                    coinLiveData.value = response.body()

                }
            }

            override fun onFailure(call: Call<CryptoCoin>, t: Throwable) {
                t.printStackTrace()

            }
        })

        return coinLiveData
    }
}
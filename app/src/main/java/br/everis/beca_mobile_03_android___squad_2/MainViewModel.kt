package br.everis.beca_mobile_03_android___squad_2

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.everis.beca_mobile_03_android___squad_2.api.CoinService
import br.everis.beca_mobile_03_android___squad_2.api.CoinService.Companion.API_KEY
import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin
import retrofit2.Call
import retrofit2.Response

class MainViewModel: ViewModel() {
    val listCoinResult: MutableList<CryptoCoin> = arrayListOf()
    private val coinLiveData: MutableLiveData<List<CryptoCoin>> = MutableLiveData()
    val listCoin : LiveData<List<CryptoCoin>>
    get() = coinLiveData

    fun init(){
        setListCoin()
    }


    private fun setListCoin() {
        val call = CoinService.coinRetrofitApi().getListCoin(API_KEY)

        call.enqueue(object : retrofit2.Callback<List<CryptoCoin>> {
            override fun onResponse(call: Call<List<CryptoCoin>>, response: Response<List<CryptoCoin>>) {
                if (response.isSuccessful)
                    response.body()?.forEach {
                        listCoinResult.add(it)
                    }
                coinLiveData.postValue(listCoinResult)
            }

            override fun onFailure(call: Call<List<CryptoCoin>>, t: Throwable) {
                coinLiveData.postValue(null)
            }
        })

    }
}
package br.everis.beca_mobile_03_android___squad_2

import androidx.lifecycle.*
import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel: ViewModel(){

    private var coinService : CoinRespository = CoinRespository()
    private val coinLiveData: MutableLiveData<List<CryptoCoin>> = MutableLiveData()

    //val listCoinResult: MutableList<CryptoCoin> = arrayListOf()
    val listCoin : LiveData<List<CryptoCoin>>
    get() = coinLiveData

     fun observeCoin(lifecycleOwner: LifecycleOwner,
                             action: (List<CryptoCoin>) -> Unit) =
         listCoin.observe(lifecycleOwner, {action(it)})


    fun getCoin() {
        viewModelScope.launch(Dispatchers.IO) {
            listCoin.run { this.postValue(CryptoCoin.getCoin()) }
        }
    }
}
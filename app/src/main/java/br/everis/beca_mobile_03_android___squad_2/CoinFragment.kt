package br.everis.beca_mobile_03_android___squad_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin
import kotlinx.android.synthetic.main.fragment_coin.*

class CoinFragment : Fragment() {

    private lateinit var mainActivityViewModel : MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater,container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_coin,container,false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mainActivityViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        mainActivityViewModel.getCoin()
        mainActivityViewModel.observeCoin(this){handleCoin(it)}
    }

    private fun handleCoin(list: List<CryptoCoin>) {
        recycler_items?.layoutManager = LinearLayoutManager(context)
        recycler_items?.adapter = context?.let { CoinAdapter(list, it) }
    }
}
package br.everis.beca_mobile_03_android___squad_2.view

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.LinearLayout
import android.widget.Toast
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import br.everis.beca_mobile_03_android___squad_2.CoinAdapter
import br.everis.beca_mobile_03_android___squad_2.R
import br.everis.beca_mobile_03_android___squad_2.MainViewModel
import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity() : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        viewModel.init(this)
        viewModel.observerCoin(this) { handleCoin(it)}

    }
    private fun handleCoin(list: List<CryptoCoin>){
        recycler_items?.layoutManager = LinearLayoutManager(this)
        recycler_items?.adapter = this?.let{CoinAdapter(list, it)}

    }
}


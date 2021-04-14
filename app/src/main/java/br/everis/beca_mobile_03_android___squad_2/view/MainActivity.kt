package br.everis.beca_mobile_03_android___squad_2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.observe
import br.everis.beca_mobile_03_android___squad_2.CoinAdapter
import br.everis.beca_mobile_03_android___squad_2.R
import br.everis.beca_mobile_03_android___squad_2.MainViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
   private lateinit var viewModel : MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProvider.NewInstanceFactory().create(MainViewModel::class.java)
        viewModel.init()
        viewModel.listCoin.observe(this,{ list ->
            if(list != null){
                recycler_items.adapter = CoinAdapter(list)
            }else{

            }
        })

    }

}
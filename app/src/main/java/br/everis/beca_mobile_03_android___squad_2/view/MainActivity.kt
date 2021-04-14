package br.everis.beca_mobile_03_android___squad_2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import br.everis.beca_mobile_03_android___squad_2.R
import androidx.recyclerview.widget.RecyclerView
import br.everis.beca_mobile_03_android___squad_2.MainViewModel


class MainActivity : AppCompatActivity() {

    lateinit var recycleCoins: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel: MainViewModel by viewModels()

        recycleCoins = findViewById(R.id.recycler_items)
    }
}
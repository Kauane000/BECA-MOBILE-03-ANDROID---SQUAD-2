package br.everis.beca_mobile_03_android___squad_2.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.everis.beca_mobile_03_android___squad_2.R
import br.everis.beca_mobile_03_android___squad_2.CoinFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            supportFragmentManager.beginTransaction()
                .add(R.id.container, CoinFragment)
                .commitNow()
        }
    }
}


package br.everis.beca_mobile_03_android___squad_2.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
<<<<<<< HEAD:app/src/main/java/br/everis/beca_mobile_03_android___squad_2/view/MainActivity.kt
import br.everis.beca_mobile_03_android___squad_2.R
=======
import androidx.recyclerview.widget.RecyclerView
>>>>>>> feat/RecyclerView:app/src/main/java/br/everis/beca_mobile_03_android___squad_2/MainActivity.kt

class MainActivity : AppCompatActivity() {

    lateinit var recycleCoins: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recycleCoins = findViewById(R.id.recycler_items)
    }
}
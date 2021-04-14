package br.everis.beca_mobile_03_android___squad_2

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin
import com.google.android.material.circularreveal.CircularRevealLinearLayout
import com.squareup.picasso.Picasso


class CoinAdapter(private var cryptoCoinList:List<CryptoCoin>, private val context: Context)
    : RecyclerView.Adapter<CoinViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.coin_item, parent,false)
        return CoinViewHolder(view)
    }


    override fun getItemCount(): Int = cryptoCoinList.size

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        if(cryptoCoinList[position].idIcon?.isNotEmpty() == true)
            Picasso.get().load(BASE_URL + cryptoCoinList[position].idIcon).into(holder.idIcon)
        holder.txtName.text = cryptoCoinList[position].name
        holder.assetID.text = cryptoCoinList[position].assetId
        holder.priceUsd?.text = cryptoCoinList[position].priceUsd
        holder.coinView.setOnClickListener{
            val intent = Intent(context, DetailsActivity::class.java)
            intent.putExtra("extra_coin", cryptoCoinList[position])
            holder.coinView.context.startActivity(intent)
        }

    }
 companion object{
     const val BASE_URL = " http://rest-sandbox.coinapi.io/"
 }
}


class CoinViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val coinView : CircularRevealLinearLayout = itemView.findViewById(R.id.cardCoinView)
    val idIcon: ImageView? = itemView.findViewById(R.id.id_icon)
    val txtName: TextView = itemView.findViewById(R.id.txt_name)
    val assetID: TextView = itemView.findViewById(R.id.asset_id)
    val priceUsd: TextView? = itemView.findViewById(R.id.price_usd)

    //fun bind(cryptoCoin : CryptoCoin){

      //  itemView.setOnClickListener{

    //    }

 //   }



   //
}

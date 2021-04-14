package br.everis.beca_mobile_03_android___squad_2

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.everis.beca_mobile_03_android___squad_2.model.CryptoCoin


class CryptoCoinAdapter(
    private val context: Context,
    private val cryptoCoinList: List<CryptoCoin>): RecyclerView.Adapter<CoinViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CoinViewHolder =
        CoinViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.coin_item, parent, false))

    override fun getItemCount(): Int = cryptoCoinList.size

    override fun onBindViewHolder(holder: CoinViewHolder, position: Int) {
        val item: CryptoCoin = cryptoCoinList[position]
//        holder.idIcon
        holder.txtName.text = item.name
        holder.assetID.text = item.asset_id
        holder.priceUsd?.text = item.data_quote_start
    }

}


class CoinViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    val idIcon: ImageView? = itemView.findViewById(R.id.id_icon)
    val txtName: TextView = itemView.findViewById(R.id.txt_name)
    val assetID: TextView = itemView.findViewById(R.id.asset_id)
    val priceUsd: TextView? = itemView.findViewById(R.id.price_usd)
}

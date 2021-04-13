package br.everis.beca_mobile_03_android___squad_2.model

import com.google.gson.annotations.SerializedName

data class CryptoCoin (

    @SerializedName("asset_id") var asset_id: String?,
    @SerializedName("name") var name: String?,
    @SerializedName("type_is_crypto") var type_is_crypto: String?,
    @SerializedName("data_star") var data_star: String?,
    @SerializedName("data_end") var data_end: String?,
    @SerializedName("data_quote_start") var data_quote_start: String?

)
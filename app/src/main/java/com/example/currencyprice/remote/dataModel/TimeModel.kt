package com.example.currencyprice.remote.dataModel

import com.google.gson.annotations.SerializedName

data class Date(
    @SerializedName("F") val F_value: String,
    @SerializedName("Y") val Y_value: String,
    @SerializedName("j") val j_value: String,
    @SerializedName("l") val l_value: String
)

data class DateModel(
    val date: Date,
    val help: String,
    val message: String,
    val success: Int
)
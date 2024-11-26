package com.example.currencyprice.remote.gold

import com.example.currencyprice.remote.dataModel.GoldModel
import retrofit2.Call
import retrofit2.http.GET

interface GoldApiService {

    @GET("currencies")
    fun getGolds():Call<GoldModel>

}
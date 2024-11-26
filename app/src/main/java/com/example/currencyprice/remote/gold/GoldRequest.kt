package com.example.currencyprice.remote.gold

import com.example.currencyprice.remote.dataModel.GoldModel


interface GoldRequest {

    fun onSuccess(date : GoldModel)

    fun onNotSuccess(message : String)

    fun onError(error : String)
}
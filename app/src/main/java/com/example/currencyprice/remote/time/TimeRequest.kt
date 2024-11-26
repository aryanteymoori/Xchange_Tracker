package com.example.currencyprice.remote.time

import com.example.currencyprice.remote.dataModel.DateModel


interface TimeRequest {

    fun onSuccess(date : DateModel)

    fun onNotSuccess(message : String)

    fun onError(error : String)
}
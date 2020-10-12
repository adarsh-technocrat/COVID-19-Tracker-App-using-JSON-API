package com.example.covid19_tracker

import okhttp3.OkHttpClient
import okhttp3.Request

object Client{   // this is singleton class

     private  val okHttpClient = OkHttpClient()
    private  val request = Request.Builder().url("https://api.covid19india.org/data.json").build()

    val api = okHttpClient.newCall(request)



}

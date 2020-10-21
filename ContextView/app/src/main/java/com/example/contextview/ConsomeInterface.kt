package com.example.contextview

import com.example.contextview.model.Usuario
import retrofit2.Call
import retrofit2.http.GET

interface ConsomeInterface {


    @GET("/cadastrados")
    fun getList(): Call<List<Usuario>>


    @GET("/primeiro")
    fun getPrimeiro():Call<Usuario>

}
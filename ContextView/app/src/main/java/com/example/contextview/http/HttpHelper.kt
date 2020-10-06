package com.example.contextview.http
import okhttp3.MediaType
import okhttp3.OkHttpClient
import okhttp3.RequestBody
import okhttp3.Request
class HttpHelper{

    fun post (json: String) : String {

        val URL = "http"

        val headerHttp = MediaType.parse("application/json; charset=utf-8")

        val client = OkHttpClient()

        val body = RequestBody.create(headerHttp, json)

        val request = Request.Builder().url(URL).post(body).build()

        val response = client.newCall(request).execute()

        return response.body().toString()
    }

        fun get(){
            val URL = "http"

            val client = OkHttpClient()

            val request = Request.Builder().url(URL).get().build()

            val response = client.newCall(request).execute()

            val responseBody = response.body()

            if (responseBody != null){
                val json = responseBody.toString()
                println("Response ------------- "+ json)

            }
        }



}
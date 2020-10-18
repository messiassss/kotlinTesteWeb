package com.example.contextview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Toast
import com.example.contextview.model.Usuario
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MainActivity : AppCompatActivity() {


        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)
            consumirApi()


        }


    fun consumirApi() {

        val retrofit = Retrofit.Builder()
            .baseUrl("https://")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val requests = retrofit.create(ConsomeInterface::class.java)

        val callFilmes = requests.getList()


    }






}
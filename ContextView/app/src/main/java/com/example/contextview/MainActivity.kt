package com.example.contextview

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.contextview.model.Usuario
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
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
            .baseUrl("https://537e3901d21f.ngrok.io")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val requests = retrofit.create(ConsomeInterface::class.java)

        val callFilmes = requests.getList()

        callFilmes.enqueue(object : Callback<List<Usuario>> {
            override fun onFailure(call: Call<List<Usuario>>, t: Throwable) {
                Toast.makeText(applicationContext, "Deu ruim $t", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<List<Usuario>>, response: Response<List<Usuario>>) {
                response.body()?.forEach {
                    


                    Toast.makeText(applicationContext, "Deu ruim ${it.nome}", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        })


    }
}
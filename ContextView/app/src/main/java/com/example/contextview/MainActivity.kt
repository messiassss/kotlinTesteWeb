package com.example.contextview

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import com.example.contextview.http.HttpHelper
import com.example.contextview.model.User
import com.google.gson.Gson
import org.jetbrains.anko.doAsync

class MainActivity : AppCompatActivity() {

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            val buttonSalvar = findViewById<Button>(R.id.bt_button)
            val nome = findViewById<EditText>(R.id.et_input1)
            val email = findViewById<EditText>(R.id.et_input2)
            val idade = findViewById<EditText>(R.id.et_input3)
            val senha = findViewById<EditText>(R.id.et_input4)

            buttonSalvar.setOnClickListener{
                val user = User()
                user.nome = nome.text.toString()
                user.email = email.text.toString()
                user.idade = idade.text.toString()
                user.senha = senha.text.toString()

                val gson = Gson()

                val userJson = gson.toJson(user)

                doAsync {
                    val http = HttpHelper()
                    http.post(userJson)
                }
            }


        }


}
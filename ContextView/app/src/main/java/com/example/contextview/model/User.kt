package com.example.contextview.model

class User {
    var id = ""

    var nome = ""

    var idade = ""

    var email = ""

    var senha = ""
    override fun toString(): String {
        return "User(id='$id', nome='$nome', idade='$idade', email='$email', senha='$senha')"
    }

}
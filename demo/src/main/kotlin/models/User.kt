package models

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class User {

    @Id
    @GeneratedValue
    val id: Int? = null

    val nome: String = ""

    val idade: Int? = null

    val email: String = ""

    val senha: String = ""


}
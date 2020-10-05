package controllers

import models.User
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpHeaders
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import repositories.Repository

@RestController
class Controller {

    @Autowired
    lateinit var repository: Repository

    @PostMapping("/cadastrar")
    fun cadastrar(@RequestBody user: User): ResponseEntity<User> {
        try {
            repository.save(user)
            return ResponseEntity.accepted().build()
        } catch (e: Exception) {
            return ResponseEntity.status(406).build()
        }
    }

}
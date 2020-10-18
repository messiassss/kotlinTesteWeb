package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.*;

@org.springframework.stereotype.Controller
@RestController
public class Controller {

    @Autowired
    private Repository repository;



    @PostMapping("/cadastrar")
    public ResponseEntity cadastrar(@RequestBody Usuario usuario) {
        repository.save(usuario);
        return ResponseEntity.accepted().build();
    }

    @GetMapping("/cadastrados")
    public ResponseEntity cadastrados(){
        List<Usuario> lista = repository.findAll();


        return ResponseEntity.ok().body(lista);

    }


    @GetMapping("/primeiro")
    public ResponseEntity primeiro(){
        List<Usuario> lista = repository.findAll();
        Usuario usuario = lista.get(0);

        return ResponseEntity.ok().body(usuario);
    }
}

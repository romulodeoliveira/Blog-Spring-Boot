package com.api.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.blog.models.Postagem;
import com.api.blog.repositories.PostagemRepository;

@RestController
@RequestMapping("/postagens")
public class PostagemController {

    @Autowired
    private PostagemRepository postagem_repository;

    // Método GET

    @GetMapping("/listar")
    public Iterable<Postagem> listar() {
        return postagem_repository.findAll();
    }

    // Método POST

    @PostMapping("/cadastrar")
    public Postagem cadastrar(@RequestBody Postagem obj) {
        return postagem_repository.save(obj);
    }

}

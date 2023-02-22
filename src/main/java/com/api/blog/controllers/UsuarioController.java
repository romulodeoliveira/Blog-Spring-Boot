package com.api.blog.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.api.blog.repositories.UsuarioRepository;
import com.api.blog.models.Usuario;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuario_repository;

    // Método GET

    @GetMapping("/listar")
    public Iterable<Usuario> listar() {
        return usuario_repository.findAll();
    }

    // Método POST

    @PostMapping("/cadastrar")
    public Usuario cadastrar(@RequestBody Usuario obj) {
        return usuario_repository.save(obj);
    }

}

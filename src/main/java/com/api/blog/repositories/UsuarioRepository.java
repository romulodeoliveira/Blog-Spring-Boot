package com.api.blog.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.blog.models.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {

}

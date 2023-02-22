package com.api.blog.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.api.blog.models.Postagem;

@Repository
public interface PostagemRepository extends CrudRepository<Postagem, Long> {

}

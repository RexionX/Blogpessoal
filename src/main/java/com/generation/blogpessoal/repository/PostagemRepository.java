package com.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.blogpessoal.model.Postagem;

//JPA da o poder da repository cominicar-se com o meu banco de dados 
public interface PostagemRepository extends JpaRepository <Postagem, Long> {

}

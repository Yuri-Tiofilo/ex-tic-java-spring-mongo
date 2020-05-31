package com.example.demo.repositories;

import com.example.demo.entities.Endereco;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface EnderecoRepository extends MongoRepository < Endereco, String> {
  
}
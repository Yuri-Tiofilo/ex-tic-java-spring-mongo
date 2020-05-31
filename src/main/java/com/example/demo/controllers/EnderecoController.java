package com.example.demo.controllers;

import java.util.List;

import com.example.demo.entities.Endereco;
import com.example.demo.repositories.EnderecoRepository;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/endereco")
public class EnderecoController {

  EnderecoRepository enderecoRepository;

  @PostMapping
  public Endereco addEndereco(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
  }
  
  @GetMapping
  public List<Endereco> getEndereco(){
		return enderecoRepository.findAll();
  }
  
  @DeleteMapping("/{id}")
  public String deleteEndereco(@PathVariable String id) {
		
		enderecoRepository.deleteById(id);
		
		return "Endereço removido com sucesso";
  }
  
  @PutMapping
	public Endereco updateEndereco(@RequestBody Endereco endereco) {
		return enderecoRepository.save(endereco);
	}
  
}
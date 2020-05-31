package com.example.demo.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Endereco")
public class Endereco {

  @Id
  private String id;
  private String rua;
  private String bairro;
  private Number numero;
  private String cidade;
  private String cep;
  private String uf;
  private String complemento;
  
  public Endereco(String id, String rua, String bairro, Number numero, String cidade, String cep, String uf,
  String complemento) {
    this.id = id;
    this.rua = rua;
    this.bairro = bairro;
    this.numero = numero;
    this.cidade = cidade;
    this.cep = cep;
    this.uf = uf;
    this.complemento = complemento;
  }

  public Endereco() {
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getRua() {
    return rua;
  }

  public void setRua(String rua) {
    this.rua = rua;
  }

  public String getBairro() {
    return bairro;
  }

  public void setBairro(String bairro) {
    this.bairro = bairro;
  }

  public Number getNumero() {
    return numero;
  }

  public void setNumero(Number numero) {
    this.numero = numero;
  }

  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public String getCep() {
    return cep;
  }

  public void setCep(String cep) {
    this.cep = cep;
  }

  public String getUf() {
    return uf;
  }

  public void setUf(String uf) {
    this.uf = uf;
  }

  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  @Override
  public String toString() {
    return "Endereco [bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", complemento=" + complemento
        + ", id=" + id + ", numero=" + numero + ", rua=" + rua + ", uf=" + uf + "]";
  }

 

  
  
}
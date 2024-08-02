package com.unidade4;

import java.time.LocalDate;

public class Dependente {
  private String nome;
  private LocalDate dataNascimento;
  private String relacao;
  private String cpf;
  private String genero;
  private String telefone;
  private String endereco;

  // Construtor
  public Dependente(String nome, LocalDate dataNascimento, String relacao, String cpf, String genero, String telefone,
      String endereco) {
    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.relacao = relacao;
    this.cpf = cpf;
    this.genero = genero;
    this.telefone = telefone;
    this.endereco = endereco;
  }

  // Getters e Setters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public LocalDate getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(LocalDate dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getRelacao() {
    return relacao;
  }

  public void setRelacao(String relacao) {
    this.relacao = relacao;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  @Override
  public String toString() {
    return "Dependente{" +
        "nome='" + nome + '\'' +
        ", dataNascimento=" + dataNascimento +
        ", relacao='" + relacao + '\'' +
        ", cpf='" + cpf + '\'' +
        ", genero='" + genero + '\'' +
        ", telefone='" + telefone + '\'' +
        ", endereco='" + endereco + '\'' +
        '}';
  }
}

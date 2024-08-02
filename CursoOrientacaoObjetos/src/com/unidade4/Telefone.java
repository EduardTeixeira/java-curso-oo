package com.unidade4;

public class Telefone {
  private String codigoPais;
  private String codigoArea;
  private String numero;
  private String tipo;
  private String descricao;

  // Construtor
  public Telefone(String codigoPais, String codigoArea, String numero, String tipo, String descricao) {
    this.codigoPais = codigoPais;
    this.codigoArea = codigoArea;
    this.numero = numero;
    this.tipo = tipo;
    this.descricao = descricao;
  }

  // Getters e Setters
  public String getCodigoPais() {
    return codigoPais;
  }

  public void setCodigoPais(String codigoPais) {
    this.codigoPais = codigoPais;
  }

  public String getCodigoArea() {
    return codigoArea;
  }

  public void setCodigoArea(String codigoArea) {
    this.codigoArea = codigoArea;
  }

  public String getNumero() {
    return numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  @Override
  public String toString() {
    return "Telefone{" +
        "codigoPais='" + codigoPais + '\'' +
        ", codigoArea='" + codigoArea + '\'' +
        ", numero='" + numero + '\'' +
        ", tipo='" + tipo + '\'' +
        ", descricao='" + descricao + '\'' +
        '}';
  }
}

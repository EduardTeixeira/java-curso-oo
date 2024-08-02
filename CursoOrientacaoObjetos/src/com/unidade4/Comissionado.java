package com.unidade4;

public class Comissionado extends ServidorPublico {

  private double comissao;
  private double salarioFixo;

  public Comissionado() {
  }

  public Comissionado(double comissao, double salarioFixo) {
    this.comissao = comissao;
    this.salarioFixo = salarioFixo;
  }

  public Comissionado(int matricula, String nome, String cargo, double comissao, double salarioFixo) {
    super(matricula, nome, cargo);
    this.comissao = comissao;
    this.salarioFixo = salarioFixo;
    super.setSalario(this.comissao + this.salarioFixo);
  }

  public double getComissao() {
    return comissao;
  }

  public void setComissao(double comissao) {
    this.comissao = comissao;
  }

  public double getSalarioFixo() {
    return salarioFixo;
  }

  public void setSalarioFixo(double salarioFixo) {
    this.salarioFixo = salarioFixo;
  }

  @Override
  public String toString() {
    return "Comissionado [comissao=" + comissao + ", salarioFixo=" + salarioFixo + ", getMatricula()=" + getMatricula()
        + ", getNome()=" + getNome() + ", getCargo()=" + getCargo() + "]";
  }

}

package com.unidade4;

public class Temporario extends ServidorPublico {

  private String contrato;
  private double salario;

  public Temporario() {
  }

  public Temporario(String contrato, double salario) {
    this.contrato = contrato;
    this.salario = salario;
  }

  public Temporario(int matricula, String nome, String cargo, String contrato, double salario) {
    super(matricula, nome, cargo);
    this.contrato = contrato;
    this.salario = salario;
  }

  public String getContrato() {
    return contrato;
  }

  public void setContrato(String contrato) {
    this.contrato = contrato;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "Temporario [contrato=" + contrato + ", salario=" + salario + ", getMatricula()=" + getMatricula()
        + ", getNome()=" + getNome() + ", getCargo()=" + getCargo() + "]";
  }

  public double calcularSalarioHorasExtras(int horasTrabalhadas) {

    double salarioMensal = 0;

    salarioMensal = salarioMensal + horasTrabalhadas * 20;

    return (this.salario + salarioMensal);
  }

}

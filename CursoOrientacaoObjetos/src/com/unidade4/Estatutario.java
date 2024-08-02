package com.unidade4;

public class Estatutario extends ServidorPublico {

  private int tempoServico;
  private double salarioBase;

  public Estatutario() {
  }

  public Estatutario(int tempoServico, double salarioBase) {
    this.tempoServico = tempoServico;
    this.salarioBase = salarioBase;
  }

  public Estatutario(int matricula, String nome, String cargo, int tempoServico, double salarioBase) {
    super(matricula, nome, cargo);
    this.tempoServico = tempoServico;
    this.salarioBase = salarioBase;
  }

  public int getTempoServico() {
    return tempoServico;
  }

  public void setTempoServico(int tempoServico) {
    this.tempoServico = tempoServico;
  }

  public double getSalarioBase() {
    return salarioBase;
  }

  public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
  }

  @Override
  public String toString() {
    return "Estatutario [tempoServico=" + tempoServico + ", salarioBase=" + salarioBase + ", getMatricula()="
        + getMatricula() + ", getNome()=" + getNome() + ", getCargo()=" + getCargo() + "]";
  }

}

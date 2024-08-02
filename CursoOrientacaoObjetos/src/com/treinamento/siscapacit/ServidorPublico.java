package com.treinamento.siscapacit;

import classes.Avaliacao;

public class ServidorPublico {

  private int matricula;
  private String nome;
  private String orgao;
  private String cargo;
  private String lotacao;
  private String email;
  private double salario;

  private String foto;
  private String vinculo;
  private int idade;
  private int tempoContribuicao;
  private String exercicio;
  private String telefone;
  private String celular;
  private String cpf;
  private String naturalidade;
  private Avaliacao avaliacao;

  public ServidorPublico() {
  }

  public ServidorPublico(int matricula, String nome, String orgao, String cargo, String lotacao, String email,
      double salario) {
    this.matricula = matricula;
    this.nome = nome;
    this.orgao = orgao;
    this.cargo = cargo;
    this.lotacao = lotacao;
    this.email = email;
    this.salario = salario;
  }

  public ServidorPublico(int matricula, String nome, String cargo) {
    this.matricula = matricula;
    this.nome = nome;
    this.cargo = cargo;
  }

  @Override
  public String toString() {
    return "ServidorPublico [matricula=" + matricula + ", nome=" + nome + ", orgao=" + orgao + ", cargo=" + cargo
        + ", lotacao=" + lotacao + ", email=" + email + ", salario=" + salario + ", foto=" + foto + ", vinculo="
        + vinculo + ", idade=" + idade + ", tempoContribuicao=" + tempoContribuicao + ", exercicio=" + exercicio
        + ", telefone=" + telefone + ", celular=" + celular + ", cpf=" + cpf + ", naturalidade=" + naturalidade
        + ", avaliacao=" + avaliacao + "]";
  }

  public static void main(String[] args) {
    ServidorPublico isabela = new ServidorPublico(1, "Isabela Teste", "Auditor");
    isabela.setSalario(15000);
    System.out.println(isabela.calcularSalarioHorasExtras(8, 10, 0, 15));
    isabela.mostrarTamanhoNome();
    isabela.mostrarPreNome();
    isabela.mostrarSobrenome();
    isabela.setAvaliacao(Avaliacao.BOM);
    System.out.println(isabela.getAvaliacao());
  }

  public void mostrarTamanhoNome() {
    System.out.println(this.nome.length());
  }

  public void mostrarPreNome() {
    System.out.println(this.nome.substring(0, nome.indexOf(" ")));
  }

  public void mostrarSobrenome() {
    System.out.println(this.nome.substring(nome.indexOf(" ") + 1));
  }

  public double calcularSalarioHorasExtras(int... horasTrabalhadas) {

    double salarioMensal = 0;

    for (int horaExtra : horasTrabalhadas) {
      salarioMensal = salarioMensal + horaExtra * 40;
    }

    return (salario + salarioMensal);
  }

  public int getMatricula() {
    return matricula;
  }

  public void setMatricula(int matricula) {
    this.matricula = matricula;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getFoto() {
    return foto;
  }

  public void setFoto(String foto) {
    this.foto = foto;
  }

  public String getOrgao() {
    return orgao;
  }

  public void setOrgao(String orgao) {
    this.orgao = orgao;
  }

  public String getVinculo() {
    return vinculo;
  }

  public void setVinculo(String vinculo) {
    this.vinculo = vinculo;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public int getTempoContribuicao() {
    return tempoContribuicao;
  }

  public void setTempoContribuicao(int tempoContribuicao) {
    this.tempoContribuicao = tempoContribuicao;
  }

  public String getCargo() {
    return cargo;
  }

  public void setCargo(String cargo) {
    this.cargo = cargo;
  }

  public String getLotacao() {
    return lotacao;
  }

  public void setLotacao(String lotacao) {
    this.lotacao = lotacao;
  }

  public String getExercicio() {
    return exercicio;
  }

  public void setExercicio(String exercicio) {
    this.exercicio = exercicio;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getCelular() {
    return celular;
  }

  public void setCelular(String celular) {
    this.celular = celular;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getNaturalidade() {
    return naturalidade;
  }

  public void setNaturalidade(String naturalidade) {
    this.naturalidade = naturalidade;
  }

  public Avaliacao getAvaliacao() {
    return avaliacao;
  }

  public void setAvaliacao(Avaliacao avaliacao) {
    this.avaliacao = avaliacao;
  }

}

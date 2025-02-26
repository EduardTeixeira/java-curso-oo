package com.unidade4;

public class Appv2 implements APIServidorPublico {

  public static void main(String[] args) {

    ServidorPublico isabela = new Comissionado(1, "Isabela", "Analista", 3000, 5000);

    verificarTipoServidorPublico(isabela);

    isabela = new Estatutario(1, "Isabela Silva", "Analista", 1, 15000);

    verificarTipoServidorPublico(isabela);

    System.out.println(isabela);
    System.out.println(((Estatutario) isabela).getTempoServico());

    ServidorPublico pedro = new Comissionado(2, "Pedro", "Analista Jr", 3000, 5000);
    System.out.println(pedro.calcularSalarioHorasExtras(40));
    System.out.println(pedro);

    System.out.println("\nClasse Abstrata");
    isabela.exibirInformacoes();

  }

  public static void verificarTipoServidorPublico(ServidorPublico servidorPublico) {
    if (servidorPublico instanceof Estatutario) {
      System.out.println("Estatutario");
    } else if (servidorPublico instanceof Comissionado) {
      System.out.println("Comissionado");
    } else if (servidorPublico instanceof Temporario) {
      System.out.println("Temporario");
    } else {
      System.out.println("Não foi especializado, permanece servidor público.");
    }
  }

  @Override
  public void adicionarServidorPublico() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'adicionarServidorPublico'");
  }

  @Override
  public void listarServidoresPublicos() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listarServidoresPublicos'");
  }

  @Override
  public void listaServidorPublico(int matricula) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listaServidorPublico'");
  }

  @Override
  public void alterarServidorPublico(ServidorPublico servidorPublico) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'alterarServidorPublico'");
  }

}

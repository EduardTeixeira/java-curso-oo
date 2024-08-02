package com.treinamento.siscapacit;

import java.util.LinkedList;
import java.util.List;

public class SiscapacitApp {

  List<ServidorPublico> servidores = new LinkedList<>();
  List<Curso> cursos = new LinkedList<>();

  public static void main(String[] args) {

    SiscapacitApp siscapacitApp = new SiscapacitApp();

    siscapacitApp.adicionarServidorPublico();
    System.out.println("\n@@@@@@@");

    siscapacitApp.listarServidoresPublicos();
    System.out.println("\n@@@@@@@");

    siscapacitApp.listarServidorPublico(2);
    System.out.println("\n@@@@@@@");

    siscapacitApp.excluirServidorPublico(2);
    System.out.println("\n@@@@@@@");

    siscapacitApp.listarServidoresPublicos();
    System.out.println("\n@@@@@@@");

    siscapacitApp.alterarServidorPublico(
        new ServidorPublico(3, "Servidor Alterado", "RFB", "Auditor", "São Paulo", "isabela@receita.br", 12000));
    System.out.println("\n@@@@@@@");

    siscapacitApp.listarServidoresPublicos();
    System.out.println("\n@@@@@@@");

    siscapacitApp.calcularFolhaServidoresPublicos();
    System.out.println("\n@@@@@@@");

    // Adicionando métodos de curso para teste
    siscapacitApp.adicionarCurso();
    System.out.println("\n@@@@@@@");

    siscapacitApp.listarCursos();
    System.out.println("\n@@@@@@@");

    siscapacitApp.listarCurso(2);
    System.out.println("\n@@@@@@@");

    siscapacitApp.excluirCurso(2);
    System.out.println("\n@@@@@@@");

    siscapacitApp.listarCursos();
    System.out.println("\n@@@@@@@");

    siscapacitApp.alterarCurso(
        new Curso(3, "Curso Alterado", "Online", "Ofertante Alterado", 1500));
    System.out.println("\n@@@@@@@");

    siscapacitApp.listarCursos();
    System.out.println("\n@@@@@@@");

    siscapacitApp.calcularCustoTotalCursos();
    System.out.println("\n@@@@@@@");
  }

  public void adicionarServidorPublico() {
    servidores.add(new ServidorPublico(1, "Isabela Teste", "RFB", "Auditor", "São Paulo", "isabela@receita.br", 12000));
    servidores.add(new ServidorPublico(2, "Isabela Teste", "RFB", "Auditor", "São Paulo", "isabela@receita.br", 12000));
    servidores.add(new ServidorPublico(3, "Isabela Teste", "RFB", "Auditor", "São Paulo", "isabela@receita.br", 12000));
  }

  public void listarServidoresPublicos() {
    for (ServidorPublico servidor : servidores) {
      System.out.println(servidor.toString());
    }
  }

  public void listarServidorPublico(int matricula) {
    int i = 0;
    for (ServidorPublico servidor : servidores) {
      i++;
      if (matricula == servidor.getMatricula()) {
        System.out.println(servidor.toString());
        System.out.println(i);
        return;
      }
    }
    System.out.println("\nServidor não encontrado... " + i);
  }

  public void excluirServidorPublico(int matricula) {
    for (ServidorPublico servidor : servidores) {
      if (matricula == servidor.getMatricula()) {
        servidores.remove(servidor);
        System.out.println("\nServidor removido com sucesso...");
        return;
      }
    }
    System.out.println("\nServidor não encontrado para remoção... ");
  }

  public void alterarServidorPublico(ServidorPublico servidorAlterado) {
    for (ServidorPublico servidor : servidores) {
      if (servidor.getMatricula() == servidorAlterado.getMatricula()) {
        servidores.remove(servidor);
        servidores.add(servidorAlterado);
        System.out.println("\nServidor alterado com sucesso...");
        return;
      }
    }
    System.out.println("\nServidor não encontrado para alteração... ");
  }

  public void calcularFolhaServidoresPublicos() {
    double folhaSalarial = 0;
    for (ServidorPublico servidor : servidores) {
      folhaSalarial = folhaSalarial + servidor.getSalario();
    }
    System.out.println("A folha salarial é ::: " + folhaSalarial);
  }

  // Métodos para Curso
  public void adicionarCurso() {
    cursos.add(new Curso(1, "Curso 1", "Presencial", "Ofertante 1", 1000));
    cursos.add(new Curso(2, "Curso 2", "Online", "Ofertante 2", 2000));
    cursos.add(new Curso(3, "Curso 3", "Híbrido", "Ofertante 3", 1500));
  }

  public void listarCursos() {
    for (Curso curso : cursos) {
      System.out.println(curso.toString());
    }
  }

  public void listarCurso(int idCurso) {
    int i = 0;
    for (Curso curso : cursos) {
      i++;
      if (idCurso == curso.getIdCurso()) {
        System.out.println(curso.toString());
        System.out.println(i);
        return;
      }
    }
    System.out.println("\nCurso não encontrado... " + i);
  }

  public void excluirCurso(int idCurso) {
    for (Curso curso : cursos) {
      if (idCurso == curso.getIdCurso()) {
        cursos.remove(curso);
        System.out.println("\nCurso removido com sucesso...");
        return;
      }
    }
    System.out.println("\nCurso não encontrado para remoção... ");
  }

  public void alterarCurso(Curso cursoAlterado) {
    for (Curso curso : cursos) {
      if (curso.getIdCurso() == cursoAlterado.getIdCurso()) {
        cursos.remove(curso);
        cursos.add(cursoAlterado);
        System.out.println("\nCurso alterado com sucesso...");
        return;
      }
    }
    System.out.println("\nCurso não encontrado para alteração... ");
  }

  public void calcularCustoTotalCursos() {
    double custoTotal = 0;
    for (Curso curso : cursos) {
      custoTotal = custoTotal + curso.getValor();
    }
    System.out.println("O custo total dos cursos é ::: " + custoTotal);
  }

}

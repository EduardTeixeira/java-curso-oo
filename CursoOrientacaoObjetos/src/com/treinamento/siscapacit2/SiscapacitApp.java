package com.treinamento.siscapacit2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SiscapacitApp implements APIServidorPublico, APICurso {

  List<ServidorPublico> servidores = new LinkedList<>();
  List<Curso> cursos = new LinkedList<>();

  public static void main(String[] args) {

    SiscapacitApp siscapacitApp = new SiscapacitApp();

    siscapacitApp.adicionarServidorPublico();
    siscapacitApp.listarServidoresPublicos();

    siscapacitApp.adicionarCurso();
    siscapacitApp.listarCursos();

    System.out.println("\n\nAtribuir curso ao servidor publico");
    siscapacitApp.adicionarCursoServidorPublico(1, 1);
    siscapacitApp.adicionarCursoServidorPublico(1, 3);
    siscapacitApp.listarCursosServidorPublico(1);

    System.out.println("\n\n @@@ adicionarServidorCurso @@@");
    siscapacitApp.adicionarServidorCurso(2, 1);
    siscapacitApp.listarServidorCurso(2);
  }

  public void adicionarServidorPublico() {
    servidores
        .add(new ServidorPublico(1, "Isabela Sampaio", "RFB", "Auditor", "São Paulo", "isabela@receita.br", 12000));
    servidores
        .add(new ServidorPublico(2, "Eduard Teixeira", "RFB", "Programador", "São Paulo", "eduard@receita.br", 12000));
  }

  public void listarServidoresPublicos() {
    System.out.println("\n@@@ LISTA SERVIDORES PUBLICOS @@@");
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
    cursos.add(new Curso(1, "Java", "Presencial", "Ofertante 1", 1000));
    cursos.add(new Curso(2, "HTML", "Online", "Ofertante 2", 2000));
    cursos.add(new Curso(3, "Python", "Híbrido", "Ofertante 3", 1500));
  }

  public void listarCursos() {
    System.out.println("\n@@@ LISTAR CURSOS @@@");
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

  @Override
  public void listaServidorPublico(int matricula) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'listaServidorPublico'");
  }

  @Override
  public void adicionarCursoServidorPublico(int matricula, int idCurso) {

    boolean encontrou = false;

    for (ServidorPublico servidor : servidores) {

      if (servidor.getMatricula() == matricula) {

        List<Curso> listCursos = new ArrayList<>();

        if (servidor.getCursos() != null) {
          listCursos.addAll(servidor.getCursos());
        }

        for (Curso curso : cursos) {
          if (curso.getIdCurso() == idCurso) {
            listCursos.add(curso);
            servidor.setCursos(listCursos);
            break;
          }
        }
        encontrou = true;
        break;
      }
      System.out.println(servidor.toString());

    }

    if (!encontrou) {
      System.out.println("Servidor Público com a matrícula ::: " + matricula + " ::: não existe");
    }
  }

  @Override
  public void excluirCursoServidorPublico(int matricula, int idCurso) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'excluirCursoServidorPublico'");
  }

  @Override
  public void listarCursosServidorPublico(int matricula) {
    for (ServidorPublico servidor : servidores) {
      if (servidor.getMatricula() == matricula) {
        System.out.println("Cursos do servidor da matricula ::: " + matricula);
        System.out.println(servidor.getCursos().toString());
      }
    }
  }

  @Override
  public void adicionarServidorCurso(int idCurso, int matricula) {
    boolean encontrou = false;
    for (Curso curso : cursos) {
      if (curso.getIdCurso() == idCurso) {
        for (ServidorPublico servidor : servidores) {
          if (servidor.getMatricula() == matricula) {
            curso.setServidores(servidor);
            encontrou = true;
            break;
          }
        }
      }
    }
    if (!encontrou) {
      System.out.println("O curso com o id informado nao existe");
    } else {
      System.out.println("O servidor publico com a matricula " + matricula + " foi adicionado");
    }
  }

  @Override
  public void excluirServidorCurso(int idCurso, int matricula) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'excluirServidorCurso'");
  }

  @Override
  public void listarServidorCurso(int idCurso) {
    for (Curso curso : cursos) {
      if (curso.getIdCurso() == idCurso) {
        System.out.println(curso.toString());
        System.out.println("Servidores");
        System.out.println(curso.getServidores().toString());
      }
    }
  }

}

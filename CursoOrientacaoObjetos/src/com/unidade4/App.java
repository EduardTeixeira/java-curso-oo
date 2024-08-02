package com.unidade4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

  public static void main(String[] args) {

    List<Curso> cursoList = new ArrayList<Curso>();
    cursoList.add(new Curso(1, "Java OO", "Presencial", "Ofertante 1", 1000));

    List<Dependente> dependentes = new ArrayList<Dependente>();
    dependentes.add(new Dependente(
        "João Silva",
        LocalDate.of(2010, 5, 15),
        "Filho",
        "123.456.789-00",
        "Masculino",
        "(11) 98765-4321",
        "Rua das Flores, 123, São Paulo, SP"));

    List<Telefone> telefones = new ArrayList<Telefone>();
    telefones.add(new Telefone(
        "+55",
        "11",
        "98765-4321",
        "Celular",
        "Telefone pessoal"));

    ServidorPublico servidorPublico = new ServidorPublico(1, "Isabela Teste", "Auditor");
    servidorPublico.setCursos(cursoList);
    servidorPublico.setDependentes(dependentes);
    servidorPublico.setTelefones(telefones);

    System.out.println("Cursos do servidor publico");
    System.out.println(servidorPublico.getCursos());

    System.out.println("Dependente do servidor publico");
    System.out.println(servidorPublico.getDependentes());

    System.out.println("Telefone do servidor publico");
    System.out.println(servidorPublico.getTelefones());

    Estatutario estatutario = new Estatutario(1055, "Isabela", "Analista Sistemas", 2, 9730);
    System.out.println(estatutario.toString());

    Comissionado comissionado = new Comissionado(1055, "Alberto", "Analista Testes", 1, 9739);
    System.out.println(comissionado.toString());
    System.out.println(comissionado.getSalario());

    Temporario temporario = new Temporario(1055, "Luisa", "Analista JR", "1", 9739);
    System.out.println(temporario.toString());
    System.out.println(temporario.getMatricula());
    System.out.println(temporario.nome);
    System.out.println(temporario.getContrato());

  }

}

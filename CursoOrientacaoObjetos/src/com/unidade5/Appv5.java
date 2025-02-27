package com.unidade5;

public class Appv5 {
  public static void main(String[] args) {
    Curso curso = new Curso(1, "Java", "Presencial", "ABC Treinamentos", 1500);
    System.out.println(curso.toString());
    System.out.println(curso.nome());
  }
}

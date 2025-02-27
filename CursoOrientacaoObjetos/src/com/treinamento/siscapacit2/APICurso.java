package com.treinamento.siscapacit2;

public interface APICurso {

  public void adicionarCurso();

  public void listarCursos();

  public void listarCurso(int matricula);

  public void alterarCurso(Curso Curso);

  public void excluirCurso(int matricula);

  public void adicionarServidorCurso(int idCurso, int matricula);

  public void excluirServidorCurso(int idCurso, int matricula);

  public void listarServidorCurso(int idCurso);

}

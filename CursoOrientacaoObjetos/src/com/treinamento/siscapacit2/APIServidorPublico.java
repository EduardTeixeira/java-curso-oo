package com.treinamento.siscapacit2;

public interface APIServidorPublico {

  public void adicionarServidorPublico();

  public void listarServidoresPublicos();

  public void listaServidorPublico(int matricula);

  public void alterarServidorPublico(ServidorPublico servidorPublico);

  public void excluirServidorPublico(int matricula);

  public void calcularFolhaServidoresPublicos();

  public void adicionarCursoServidorPublico(int matricula, int idCurso);

  public void excluirCursoServidorPublico(int matricula, int idCurso);

  public void listarCursosServidorPublico(int matricula);

}

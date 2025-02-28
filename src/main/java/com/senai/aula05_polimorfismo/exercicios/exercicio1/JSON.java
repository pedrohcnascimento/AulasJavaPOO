package com.senai.aula05_polimorfismo.exercicios.exercicio1;

public class JSON extends Relatorio{

    @Override
    public void setExtensaoArquivo(String extensaoArquivo) {
        super.setExtensaoArquivo(".json");
    }

    public JSON(long id, String nome, int numPaginas, String extensaoArquivo) {
        super(id, nome, numPaginas, extensaoArquivo);
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void gerarRelatorio() {
        System.out.println("Arquivo criado como: relatorio"+getExtensaoArquivo());
    }
}

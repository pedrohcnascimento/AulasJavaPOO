package com.senai.aula05_polimorfismo.exercicios.exercicio1;

public class Relatorio {
    private long id;
    private String nome;
    private int numPaginas;
    private String extensaoArquivo;

    public Relatorio(long id, String nome, int numPaginas, String extensaoArquivo) {
        this.id = id;
        this.nome = nome;
        this.numPaginas = numPaginas;
        this.extensaoArquivo = extensaoArquivo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getExtensaoArquivo() {
        return extensaoArquivo;
    }

    public void setExtensaoArquivo(String extensaoArquivo) {
        this.extensaoArquivo = extensaoArquivo;
    }

    @Override
    public String toString() {
        return "Relatorio{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                ", extensaoArquivo='" + extensaoArquivo + '\'' +
                '}';
    }

    public void gerarRelatorio(){
        System.out.println("");
    }
}

package com.senai.aula04_herancas.exercicios.exercicio5;

public class LivroFisico extends Livro{
    private int numeroDePaginas;

    public LivroFisico(String titulo, String autor, int numeroDePaginas) {
        super(titulo, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }
}

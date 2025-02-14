package com.senai.aula04_herancas.exercicios.exercicio5;

public class LivroOnline extends Livro{
    private double tamanhoArquivo;

    public LivroOnline(String titulo, String autor, double tamanhoArquivo) {
        super(titulo, autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public void setTamanhoArquivo(double tamanhoArquivo) {
        this.tamanhoArquivo = tamanhoArquivo;
    }
}

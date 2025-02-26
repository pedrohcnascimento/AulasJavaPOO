package com.senai.aula04_herancas.exercicios.exercicio5;

public class LivroOnline extends Livro{
    private double tamanhoArquivo;

    public LivroOnline(long id, String titulo, String autor, double tamanhoArquivo) {
        super(id, titulo, autor);
        this.tamanhoArquivo = tamanhoArquivo;
    }

    @Override
    public double getAtributo() {
        return tamanhoArquivo;
    }

    @Override
    public void setAtributo(double atributo) {
        this.tamanhoArquivo = atributo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Tamanho do arquivo:" + tamanhoArquivo;
    }
}

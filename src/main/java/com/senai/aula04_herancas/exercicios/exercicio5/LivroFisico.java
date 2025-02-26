package com.senai.aula04_herancas.exercicios.exercicio5;

public class LivroFisico extends Livro{
    private double numeroDePaginas;

    public LivroFisico(long id, String titulo, String autor, double numeroDePaginas) {
        super(id, titulo, autor);
        this.numeroDePaginas = numeroDePaginas;
    }

    @Override
    public double getAtributo() {
        return numeroDePaginas;
    }

    @Override
    public void setAtributo(double atributo) {
        this.numeroDePaginas = atributo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Número de páginas: "+ numeroDePaginas;
    }
}

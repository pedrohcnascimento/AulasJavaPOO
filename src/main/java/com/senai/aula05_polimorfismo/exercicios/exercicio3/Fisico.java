package com.senai.aula05_polimorfismo.exercicios.exercicio3;

public class Fisico extends Produto{

    public Fisico(long id, double preco, int quantidade, double imposto) {
        super(id, preco, quantidade, imposto);
    }

    @Override
    public double calcularImposto() {
        return super.calcularImposto();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

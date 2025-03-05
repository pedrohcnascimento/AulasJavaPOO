package com.senai.aula05_polimorfismo.exercicios.exercicio3;

public class Servico extends Produto{

    public Servico(long id, double preco, int quantidade, double imposto) {
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

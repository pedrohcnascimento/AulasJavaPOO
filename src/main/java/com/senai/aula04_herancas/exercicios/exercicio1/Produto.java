package com.senai.aula04_herancas.exercicios.exercicio1;

public class Produto {
    private double preco;
    private int quantidade;

    public Produto(double preco, int quantidade) {
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

package com.senai.aula04_herancas.exercicios.exercicio1;

public class Alimento extends Produto{
    private String dataDeValidade;

    public Alimento(double preco, int quantidade, String dataDeValidade) {
        super(preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    public String getDataDeValidade() {
        return dataDeValidade;
    }

    public void setDataDeValidade(String dataDeValidade) {
        this.dataDeValidade = dataDeValidade;
    }
}

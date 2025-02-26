package com.senai.aula04_herancas.exercicios.exercicio1;

public class Alimento extends Produto{
    private String dataDeValidade;

    public Alimento(int id, String nome, double preco, int quantidade, String dataDeValidade) {
        super(id, nome, preco, quantidade);
        this.dataDeValidade = dataDeValidade;
    }

    @Override
    public String getAtributo() {
        return dataDeValidade;
    }

    @Override
    public void setAtributo(String atributo) {
        this.dataDeValidade = atributo;
    }

    @Override
    public String toString() {
        return super.toString()
            + "Data de validade: " + getAtributo();
    }
}

package com.senai.aula04_herancas.exercicios.exercicio1;

public class Eletronico extends Produto{
    private String voltagem;

    public Eletronico(int id, String nome, double preco, int quantidade, String voltagem) {
        super(id, nome, preco, quantidade);
        this.voltagem = voltagem;
    }

    @Override
    public String getAtributo() {
        return voltagem;
    }

    @Override
    public void setAtributo(String atributo) {
        this.voltagem = atributo;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Voltagem: " + this.voltagem;
    }
}

package com.senai.aula04_herancas.exercicios.exercicio1;

public class Eletronico extends Produto{
    private int voltagem;

    public Eletronico(double preco, int quantidade, int voltagem) {
        super(preco, quantidade);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }
}

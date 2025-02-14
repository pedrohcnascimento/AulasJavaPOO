package com.senai.aula04_herancas.exercicios.exercicio1;

public class Eletronico extends Produto{
    private int voltagem;

    public Eletronico(int id, String nome, double preco, int quantidade, int voltagem) {
        super(id, nome, preco, quantidade);
        this.voltagem = voltagem;
    }

    public int getVoltagem() {
        return voltagem;
    }

    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    @Override
    public String toString() {
        return super.toString()
                + "Voltagem" + getVoltagem();
    }
}

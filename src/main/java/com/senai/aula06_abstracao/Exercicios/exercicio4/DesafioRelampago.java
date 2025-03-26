package com.senai.aula06_abstracao.Exercicios.exercicio4;

public class DesafioRelampago implements Evento{
    private double duracaoEvento;
    private int valorPremio;
    private double velocidade;

    public DesafioRelampago(double duracaoEvento, int valorPremio, double velocidade) {
        this.duracaoEvento = duracaoEvento;
        this.valorPremio = valorPremio;
        this.velocidade = velocidade;
    }

    public double getDuracaoEvento() {
        return duracaoEvento;
    }

    public void setDuracaoEvento(double duracaoEvento) {
        this.duracaoEvento = duracaoEvento;
    }

    public int getValorPremio() {
        return valorPremio;
    }

    public void setValorPremio(int valorPremio) {
        this.valorPremio = valorPremio;
    }
}

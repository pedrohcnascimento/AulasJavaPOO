package com.senai.aula06_abstracao.Exercicios.exercicio4;

public class EventoSocial implements Evento{
    private double duracaoEvento;
    private int valorPremio;

    public EventoSocial(double duracaoEvento, int valorPremio) {
        this.duracaoEvento = duracaoEvento;
        this.valorPremio = valorPremio;
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

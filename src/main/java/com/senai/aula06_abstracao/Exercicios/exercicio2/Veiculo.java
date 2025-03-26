package com.senai.aula06_abstracao.Exercicios.exercicio2;

public abstract class Veiculo {
    double velocidadeAtual;
    protected double capacidadeMaximaCarga;
    protected int distanciaDestinoKM;

    public Veiculo(int velocidadeAtual, double capacidadeMaximaCarga, int distanciaDestinoKM) {
        this.velocidadeAtual = velocidadeAtual;
        this.capacidadeMaximaCarga = capacidadeMaximaCarga;
        this.distanciaDestinoKM = distanciaDestinoKM;
    }

    public void verificarVelocidadeAtual(){
        System.out.println("A velocidade atual é: " + velocidadeAtual);
    }
    public void verificarDistanciaDestino(){
        System.out.println("Distância atual do destino: " + distanciaDestinoKM);
    }

    abstract void calcularTempoEntrega();
}

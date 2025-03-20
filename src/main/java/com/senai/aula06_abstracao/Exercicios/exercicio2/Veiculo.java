package com.senai.aula06_abstracao.Exercicios.exercicio2;

public abstract class Veiculo {
    int velocidadeAtual;
    protected double capacidadeMaximaCarga;
    protected int distanciaDestinoKM;

    public void verificarVelocidadeAtual(){
        System.out.println("A velocidade atual é: " + velocidadeAtual);
    }
    public void verificarDistanciaDestino(){
        System.out.println("Distância atual do destino: " + distanciaDestinoKM);
    }

    abstract void calcularTempoEntrega();
}

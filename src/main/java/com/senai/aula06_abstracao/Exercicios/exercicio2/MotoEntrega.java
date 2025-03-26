package com.senai.aula06_abstracao.Exercicios.exercicio2;

public class MotoEntrega extends Veiculo{
    public MotoEntrega(int velocidadeAtual, double capacidadeMaximaCarga, int distanciaDestinoKM) {
        super(velocidadeAtual, capacidadeMaximaCarga, distanciaDestinoKM);
    }

    @Override
    void calcularTempoEntrega() {
        double tempoEntrega = distanciaDestinoKM / (velocidadeAtual * 2);
        System.out.println("A moto irá demorar: "+tempoEntrega+" minutos para deixar a entrega.");
    }
}

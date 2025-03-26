package com.senai.aula06_abstracao.Exercicios.exercicio2;

public class CaminhaoEntrega extends Veiculo{
    public CaminhaoEntrega(int velocidadeAtual, double capacidadeMaximaCarga, int distanciaDestinoKM) {
        super(velocidadeAtual, capacidadeMaximaCarga, distanciaDestinoKM);
    }

    @Override
    void calcularTempoEntrega() {
        double tempoEntrega = distanciaDestinoKM + capacidadeMaximaCarga / velocidadeAtual;
        System.out.println("O caminhão ira demorar: "+tempoEntrega+" horas para deixar a entrega.");
    }
}

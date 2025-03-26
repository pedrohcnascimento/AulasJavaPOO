package com.senai.aula06_abstracao.Exercicios.exercicio2;

public class CarroEntrega extends Veiculo{
    public CarroEntrega(int velocidadeAtual, double capacidadeMaximaCarga, int distanciaDestinoKM) {
        super(velocidadeAtual, capacidadeMaximaCarga, distanciaDestinoKM);
    }

    @Override
    void calcularTempoEntrega() {
        double tempoEntrega = distanciaDestinoKM / velocidadeAtual;
        System.out.println("O carro irá demorar: "+tempoEntrega+" minutos para deixar a entrega.");
    }
}

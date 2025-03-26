package com.senai.aula06_abstracao.Exercicios.exercicio2;

public class Main {
    public static void main(String[] args) {
        testarVeiculo(new CarroEntrega(100,8500,1000));
        testarVeiculo(new CaminhaoEntrega(80,15000,4000));
        testarVeiculo(new MotoEntrega(150,150,3200));
    }
    private static void testarVeiculo(Veiculo veiculo){
        System.out.println("-----------Testando Veiculo-------------");
        veiculo.verificarDistanciaDestino();
        veiculo.verificarVelocidadeAtual();
        veiculo.calcularTempoEntrega();
    }
}

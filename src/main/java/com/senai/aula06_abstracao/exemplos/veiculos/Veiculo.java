package com.senai.aula06_abstracao.exemplos.veiculos;

abstract class Veiculo {
    int velocidade;

    public Veiculo(int velocidade) {
        this.velocidade = velocidade;
    }

    void acelerar(int incremento){
        velocidade += incremento;
        System.out.println("Acelerando para "+ velocidade + "Km/h.");
    }

    abstract void ligar();
}

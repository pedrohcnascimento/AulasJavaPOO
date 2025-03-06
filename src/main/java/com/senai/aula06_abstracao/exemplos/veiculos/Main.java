package com.senai.aula06_abstracao.exemplos.veiculos;

public class Main {
    public static void main(String[] args) {


        Moto moto = new Moto(120);
        Carro carro = new Carro(120);

        carro.ligar();
        carro.acelerar(30);

        System.out.println("--------------------");


        moto.ligar();
        moto.acelerar(40);
    }
}

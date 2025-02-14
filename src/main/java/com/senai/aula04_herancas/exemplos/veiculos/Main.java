package com.senai.aula04_herancas.exemplos.veiculos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota",2007,4);
        Moto moto = new Moto("Harley Davdson",2018,true);

        System.out.println("Detalhes do carro: ");
        carro.exibirdetalhes();

        System.out.println("Detalhes da moto:");
        moto.exibirdetalhes();
    }
}
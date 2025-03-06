package com.senai.aula06_abstracao.exemplos.animal;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Whiskey");

        cachorro.dormir();
        cachorro.fazerSom();

        System.out.println("--------------------");

        gato.dormir();
        gato.fazerSom();

        System.out.println("--------------------");
    }
}

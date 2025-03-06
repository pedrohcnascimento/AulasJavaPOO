package com.senai.aula06_abstracao.exemplos.animal;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Whiskey");

        Animal animal = cachorro;

        emitirSom(cachorro);
        emitirSom(gato);
        emitirSom(animal);
    }
    public static void emitirSom(Animal animal){
        animal.dormir();
        animal.fazerSom();
    }
}

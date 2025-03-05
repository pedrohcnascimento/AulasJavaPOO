package com.senai.aula05_polimorfismo.exemplos.sobrescrita_metodos;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.fazerSom();
        animal = new Gato();
        animal.fazerSom();
        animal = new Cachorro();
        animal.fazerSom();

        emitirSom(new Animal());
        emitirSom(new Cachorro());
        emitirSom(new Gato());
    }

    public static void emitirSom(Animal animal){
        System.out.println("-----------------");
        animal.fazerSom();
    }
}

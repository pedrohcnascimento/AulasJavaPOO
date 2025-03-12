package com.senai.aula06_abstracao.exemplos_classes.animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        Gato gato = new Gato("Whiskey");

        Animal animal = cachorro;

        emitirSom(cachorro);
        emitirSom(gato);
        emitirSom(animal);

        List<Animal> listaAnimais = new ArrayList<>();

        listaAnimais.add(cachorro);
        listaAnimais.add(gato);

        listaAnimais.forEach(Animal :: dormir);
    }
    public static void emitirSom(Animal animal){
        animal.fazerSom();
    }
}

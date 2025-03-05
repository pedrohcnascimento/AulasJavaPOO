package com.senai.aula05_polimorfismo.exemplos.sobrescrita_metodos;

public class Cachorro extends Animal{
    @Override
    void fazerSom() {
        System.out.println("O cachorro faz: au au au");
    }
}

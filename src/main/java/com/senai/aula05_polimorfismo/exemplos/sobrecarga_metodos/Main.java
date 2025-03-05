package com.senai.aula05_polimorfismo.exemplos.sobrecarga_metodos;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.somar(2,3));
        System.out.println(calculadora.somar(2,3,4));
        System.out.println(calculadora.somar(2.3,3.5));
        System.out.println(calculadora.somar(1,5.3));
        System.out.println(calculadora.somar(9.2,3));
    }
}

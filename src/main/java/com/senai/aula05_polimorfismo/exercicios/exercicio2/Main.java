package com.senai.aula05_polimorfismo.exercicios.exercicio2;

public class Main {

    public static void main(String[] args) {
        Reserva[] reservas = {
                new Vip(1,"Terraço",1000,230,13),
                new Simples(2,"Meio",1000,30)
        };

        for (Reserva r : reservas){
            r.calcularCusto();
            System.out.println(r);
        }
    }
}

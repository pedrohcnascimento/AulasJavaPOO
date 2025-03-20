package com.senai.aula06_abstracao.Exercicios.exercicio1;

public class Main {
    public static void main(String[] args) {
        testando( new Azul("10/10/2010","10/10/2010","3124531","3124531"));
        testando( new Gol(101,101,"Pedro", "Pedro"));
    }
    private static void testando(CheckIn checkIn){
        System.out.println("-----------Testando--------------");
        CheckIn.mensagemPadrao();
        boolean bagagens = CheckIn.verificarBagagens(4,2,8,15);
        checkIn.emitirCartaoEmbarque(bagagens);
    }
}

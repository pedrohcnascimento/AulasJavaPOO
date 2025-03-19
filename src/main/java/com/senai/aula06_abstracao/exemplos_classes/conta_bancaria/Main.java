package com.senai.aula06_abstracao.exemplos_classes.conta_bancaria;

public class Main {
    public static void main(String[] args) {
        testeContas(new ContaCorrente("Pedro", 1000));
        testeContas(new ContaPoupanca("Kauan", 1000));
    }
    private static void testeContas(ContaBancaria conta){
        System.out.println("--------------Teste conta ------------");
        System.out.println("Antes: ");
        conta.consultarSaldo();
        conta.aplicarTaxaMensal();
        System.out.println("Depois: ");
        conta.consultarSaldo();
    }
}

package com.senai.aula04_herancas.exemplos.contas_bancarias;

public class Main {
    public static void main(String[] args) {
        Conta conta1 = new Conta("Pedro",1000);
        ContaCorrente conta2 = new ContaCorrente("Kauan",1000,250);
        ContaPoupanca conta3 = new ContaPoupanca("Rafael",1000,0.3);

        conta1.exibirSaldo();
        conta2.exibirSaldo();
        conta3.exibirSaldo();

        conta1.sacar(100000);
        conta1.sacar(100);
        conta1.exibirSaldo();

        conta2.sacar(900);
        conta2.exibirSaldo();

        conta3.aplicarRendimento();
        conta3.exibirSaldo();
    }
}

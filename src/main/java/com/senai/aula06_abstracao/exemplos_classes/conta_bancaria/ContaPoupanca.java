package com.senai.aula06_abstracao.exemplos_classes.conta_bancaria;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void aplicarTaxaMensal() {
        saldo += saldo * 0.05;
    }
}

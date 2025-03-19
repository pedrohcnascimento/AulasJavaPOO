package com.senai.aula06_abstracao.exemplos_classes.conta_bancaria;

public class ContaCorrente extends ContaBancaria{

    public ContaCorrente(String titular, double saldo) {
        super(titular, saldo);
    }

    @Override
    public void aplicarTaxaMensal() {
        saldo -= 20;
    }
}

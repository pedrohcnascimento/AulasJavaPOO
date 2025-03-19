package com.senai.aula06_abstracao.exemplos_classes.conta_bancaria;

public abstract class ContaBancaria {
    protected String titular;
    protected double saldo;

    public ContaBancaria(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    abstract public void aplicarTaxaMensal();

    public void depositar(double valor){
        if (valor <= 0){
            System.out.println("Você não pode depositar um valor negativo!");
        }else {
            saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void consultarSaldo(){
        System.out.println("Titular: "+titular+"\nSaldo: R$"+saldo);
    }
}
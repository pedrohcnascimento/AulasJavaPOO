package com.senai.aula04_herancas.exemplos.contas_bancarias;

public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(String titular, double saldo, double limite) {
        super(titular, saldo);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        if (valor >= (super.getSaldo()+limite)){
            super.setSaldo(getSaldo() - valor);
        }else {
            System.out.println("Saldo ou limite insuficiente.");
        }
    }

    public void exibirSaldo() {
        super.exibirSaldo();
    }
}

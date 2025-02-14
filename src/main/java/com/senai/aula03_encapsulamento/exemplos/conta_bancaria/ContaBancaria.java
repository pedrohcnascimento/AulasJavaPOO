package com.senai.aula03_encapsulamento.exemplos.conta_bancaria;

public class ContaBancaria {
    private Usuario usuario;
    private int numeroDaConta;
    private double saldoBancario;
    private String nomeDoBanco;

    @Override
    public String toString() {
        return "ContaBancaria{" +
                "usuario=" + usuario +
                ", numeroDaConta=" + numeroDaConta +
                ", saldoBancario=" + saldoBancario +
                ", nomeDoBanco='" + nomeDoBanco + '\'' +
                '}';
    }
}

package com.senai.aula04_herancas.exemplos.funcionarios;

public class Main {
    public static void main(String[] args) {
        Funcionario f1 =new Funcionario("Kauan",100);
        Gerente g1 = new Gerente("Pedro",100000,9999);

        f1.exibirDados();
        g1.exibirDados();
    }
}

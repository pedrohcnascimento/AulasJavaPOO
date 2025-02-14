package com.senai.aula04_herancas.exemplos.funcionarios;

public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, double salario, double bonus) {
        super(nome, salario);
        this.bonus = bonus;
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: "+getNome()+"Salário total: R$"+(getSalario()+bonus));
    }
}

package com.senai.aula06_abstracao.exemplos_classes.gerenciamento_funcionarios;

public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentagem){
        salario += salario * (porcentagem / 100);
    }

    public abstract void calcularBonus();

    public void exibirDados(){
        System.out.printf("%s recebe R$%,.2f\n" , nome , salario);
    }
}

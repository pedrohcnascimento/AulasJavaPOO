package com.senai.aula04_herancas.exercicios.exercicio2;

public class Professor extends Funcionario{
    private String disciplica;

    public Professor(String nome, double salario, String disciplica) {
        super(nome, salario);
        this.disciplica = disciplica;
    }

    public String getDisciplica() {
        return disciplica;
    }

    public void setDisciplica(String disciplica) {
        this.disciplica = disciplica;
    }
}

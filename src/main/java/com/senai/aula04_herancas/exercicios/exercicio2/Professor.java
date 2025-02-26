package com.senai.aula04_herancas.exercicios.exercicio2;

public class Professor extends Funcionario{
    private String disciplina;

    public Professor(int id, String nome, double salario, String disciplina) {
        super(id, nome, salario);
        this.disciplina = disciplina;
    }

    @Override
    public String getAtributo() {
        return disciplina;
    }

    @Override
    public void setAtributo(String atributo) {
        this.disciplina = atributo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "disciplina:" + this.disciplina;
    }
}
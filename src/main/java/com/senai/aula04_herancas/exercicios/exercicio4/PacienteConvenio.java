package com.senai.aula04_herancas.exercicios.exercicio4;

public class PacienteConvenio extends Paciente{
    private double descontoCusto;

    public PacienteConvenio(String nome, int idade, double descontoCusto) {
        super(nome, idade);
        this.descontoCusto = descontoCusto;
    }

    public double getDescontoCusto() {
        return descontoCusto;
    }

    public void setDescontoCusto(double descontoCusto) {
        this.descontoCusto = descontoCusto;
    }
}

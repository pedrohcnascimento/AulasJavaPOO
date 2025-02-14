package com.senai.aula04_herancas.exercicios.exercicio4;

public class PacienteParticular extends Paciente{
    private double custoConsulta;

    public PacienteParticular(String nome, int idade, double custoConsulta) {
        super(nome, idade);
        this.custoConsulta = custoConsulta;
    }

    public double getCustoConsulta() {
        return custoConsulta;
    }

    public void setCustoConsulta(double custoConsulta) {
        this.custoConsulta = custoConsulta;
    }
}

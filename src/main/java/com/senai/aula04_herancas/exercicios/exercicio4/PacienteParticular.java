package com.senai.aula04_herancas.exercicios.exercicio4;

public class PacienteParticular extends Paciente{
    private double custoConsulta;

    public PacienteParticular(long id, String nome, int idade, double custoConsulta) {
        super(id, nome, idade);
        this.custoConsulta = custoConsulta;
    }

    @Override
    public double getAtributo() {
        return custoConsulta;
    }

    @Override
    public void setAtributo(double atributo) {
        this.custoConsulta = atributo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Custo da consulta: " + custoConsulta;
    }
}

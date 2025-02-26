package com.senai.aula04_herancas.exercicios.exercicio2;

public class Coordenador extends Funcionario {
    private String equipeProfessores;


    public Coordenador(int id, String nome, double salario, String equipeProfessores) {
        super(id, nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    @Override
    public String getAtributo() {
        return equipeProfessores;
    }

    @Override
    public void setAtributo(String atributo) {
        this.equipeProfessores = atributo;
    }

    @Override
    public String toString() {
        return super.toString() +
                "equipeProfessores: " + equipeProfessores;
    }
}
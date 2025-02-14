package com.senai.aula04_herancas.exercicios.exercicio2;

public class Coordenador extends Funcionario{
    private String equipeProfessores;

    public Coordenador(String nome, double salario, String equipeProfessores) {
        super(nome, salario);
        this.equipeProfessores = equipeProfessores;
    }

    public String getEquipeProfessores() {
        return equipeProfessores;
    }

    public void setEquipeProfessores(String equipeProfessores) {
        this.equipeProfessores = equipeProfessores;
    }
}

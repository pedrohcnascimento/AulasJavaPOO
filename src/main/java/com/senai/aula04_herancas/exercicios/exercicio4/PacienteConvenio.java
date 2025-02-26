package com.senai.aula04_herancas.exercicios.exercicio4;

public class PacienteConvenio extends Paciente{
    private double descontoCusto;

    public PacienteConvenio(long id, String nome, int idade, double descontoCusto) {
        super(id,  nome, idade);
        this.descontoCusto = descontoCusto;
    }

    @Override
    public double getAtributo() {
        return descontoCusto;
    }

    @Override
    public void setAtributo(double atributo) {
        this.descontoCusto = atributo;
    }

    @Override
    public String toString() {
        return super.toString()+
                "Desconto no custo: " + descontoCusto;
    }
}

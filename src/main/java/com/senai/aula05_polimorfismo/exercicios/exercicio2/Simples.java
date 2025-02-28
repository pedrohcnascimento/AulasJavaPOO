package com.senai.aula05_polimorfismo.exercicios.exercicio2;

public class Simples extends Reserva{
    private int diasAntecedencia;

    public Simples(long id, String nome, double valorTotal, int diasAntecedencia) {
        super(id, nome, valorTotal);
        this.diasAntecedencia = diasAntecedencia;
    }

    public int getDiasAntecedencia() {
        return diasAntecedencia;
    }

    public void setDiasAntecedencia(int diasAntecedencia) {
        this.diasAntecedencia = diasAntecedencia;
    }

    @Override
    public void calcularCusto() {
        setValorTotal(getValorTotal()-diasAntecedencia);
        System.out.println(getValorTotal());
    }

    @Override
    public String toString() {
        return "Reserva "+getId()+" para "+getNome()+" custará: "+getValorTotal();
    }
}

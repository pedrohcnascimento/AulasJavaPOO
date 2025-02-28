package com.senai.aula05_polimorfismo.exercicios.exercicio2;

public class Vip extends Reserva{
    private double valorLugar;
    private int diasAntecedencia;

    public Vip(long id, String nome, double valorTotal, double valorLugar, int diasAntecedencia) {
        super(id, nome, valorTotal);
        this.valorLugar = valorLugar;
        this.diasAntecedencia = diasAntecedencia;
    }

    public double getValorLugar() {
        return valorLugar;
    }

    public void setValorLugar(double valorLugar) {
        this.valorLugar = valorLugar;
    }

    public int getDiasAntecedencia() {
        return diasAntecedencia;
    }

    public void setDiasAntecedencia(int diasAntecedencia) {
        this.diasAntecedencia = diasAntecedencia;
    }

    @Override
    public void calcularCusto() {
        setValorTotal(getValorTotal()+valorLugar-diasAntecedencia);
        System.out.println(getValorTotal());
    }

    @Override
    public String toString() {
        return "Reserva "+getId()+" para "+getNome()+"custará: "+getValorTotal();
    }
}

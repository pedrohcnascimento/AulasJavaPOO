package com.senai.aula05_polimorfismo.exercicios.exercicio4;

public class Umidade extends Sensor{
    private double porcentagem;

    public Umidade(long id, boolean status, double porcentagem) {
        super(id, status);
        this.porcentagem = porcentagem;
    }

    public double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override
    public String toString() {
        return super.toString()+ " Percentual de umidade: "+ porcentagem;
    }
}

package com.senai.aula05_polimorfismo.exercicios.exercicio4;

public class Temperatura extends Sensor{
    private double temperatura;

    public Temperatura(long id, boolean status, double temperatura) {
        super(id, status);
        this.temperatura = temperatura;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return super.toString() + " Temperatura: "+ temperatura;
    }
}

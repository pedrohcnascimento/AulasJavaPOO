package com.senai.aula05_polimorfismo.exercicios.exercicio5;

public class Beneficio {
    private long id;
    private double salario;
    private double desconto;

    public Beneficio(long id, double salario, double desconto) {
        this.id = id;
        this.salario = salario;
        this.desconto = desconto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    @Override
    public String toString() {
        return "Beneficio{" +
                "id=" + id +
                ", salario=" + salario +
                ", desconto=" + desconto +
                '}';
    }
}

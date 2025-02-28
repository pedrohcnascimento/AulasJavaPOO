package com.senai.aula05_polimorfismo.exercicios.exercicio2;

public class Reserva {
    private long id;
    private String nome;
    private double valorTotal;

    public Reserva(long id, String nome, double valorTotal) {
        this.id = id;
        this.nome = nome;
        this.valorTotal = valorTotal;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void calcularCusto(){
        System.out.println(valorTotal);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valorTotal=" + valorTotal +
                '}';
    }
}

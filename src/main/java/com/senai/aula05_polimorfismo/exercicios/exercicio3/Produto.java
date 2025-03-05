package com.senai.aula05_polimorfismo.exercicios.exercicio3;

public class Produto {
    private long id;
    private double preco;
    private int quantidade;
    private double imposto;

    public Produto(long id, double preco, int quantidade, double imposto) {
        this.id = id;
        this.preco = preco;
        this.quantidade = quantidade;
        this.imposto = imposto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }

    public double calcularImposto(){
        double valorTotal = (preco + imposto) * quantidade;
        return valorTotal;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", imposto=" + imposto +
                '}';
    }
}

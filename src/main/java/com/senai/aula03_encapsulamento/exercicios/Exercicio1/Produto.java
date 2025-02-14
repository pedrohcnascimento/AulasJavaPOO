package com.senai.aula03_encapsulamento.exercicios.Exercicio1;

public class Produto    {
    private int ID;
    private String nome;
    private double preco;

    public Produto(int ID, String nome, double preco) {
        this.ID = ID;
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto "+ ID + "- Nome: " + nome + " Preço: " + preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco < 0){
            System.out.println("O preço do produto não pode ser negativo");
        }else {
            this.preco = preco;
        }
    }
}

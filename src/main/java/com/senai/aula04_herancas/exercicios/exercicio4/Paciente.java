package com.senai.aula04_herancas.exercicios.exercicio4;

public class Paciente {
    private long id;
    private String nome;
    private int idade;
    private double atributo;

    public Paciente(long id, String nome, int idade) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getAtributo() {
        return atributo;
    }

    public void setAtributo(double atributo) {
        this.atributo = atributo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade;
    }
}

package com.senai.aula03_encapsulamento.exemplos.conta_bancaria;

public class Usuario {
    private String nome;
    private int CPF;
    private String dataDeNascimento;

    public String getNome(){
        return this.nome;
    }

    public void setNome(){
        this.nome = nome;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", CPF=" + CPF +
                ", dataDeNascimento='" + dataDeNascimento + '\'' +
                '}';
    }
}

package com.senai.aula03_encapsulamento.exercicios.Exercicio3;

public class Funcionario {
    private int ID;
    private String nome;
    private double salario;
    private String cargo;

    public Funcionario(int ID, String nome, double salario, String cargo) {
        this.ID = ID;
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Funcionário " + ID + " Nome: " + " Salario: " + salario + " Cargo: " + cargo;
    }

    public int getID() {
        return ID;
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if (nome == null || nome.isBlank()){
            System.out.println("A pessoa precisa possuir um nome\n");
            return false;
        }else {
            this.nome = nome;
            return true;
        }
    }

    public double getSalario() {
        return salario;
    }

    public boolean setSalario(double salario) {
        if (salario < 1320){
            System.out.println("O funcionário precisa possuir um salário maior ou igual a um salário mínimo!\n");
            return false;
        }else {
            this.salario = salario;
            return true;
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}

package com.senai.aula01_classes_atributo_metodos.exercicios.exercicio2;

import java.util.Scanner;

public class Aluno {
    public String nome;
    public int idade;
    public float notaFinal;

    public void exibirInformacoes(){
        System.out.println("O nome do aluno é: "+nome+"\nSua idade é: "+idade+"\nE a notaFinal é: "+notaFinal);
    }
    public void atualizarNota(float novaNota){
        notaFinal = novaNota;
    }
    public boolean verificarAprovacao(){
        return notaFinal >= 6.0;
    }

    @Override
    public String toString() {
        return "O nome do aluno é: "+nome+"\nSua idade é: "+idade+"\nE a notaFinal é: "+notaFinal;
    }

    public Aluno(String nome, int idade, float notaFinal) {
        this.nome = nome;
        this.idade = idade;
        this.notaFinal = notaFinal;
    }
}

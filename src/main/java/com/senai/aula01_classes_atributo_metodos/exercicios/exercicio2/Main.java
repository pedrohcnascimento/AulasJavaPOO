package com.senai.aula01_classes_atributo_metodos.exercicios.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        Aluno aluno1 =new Aluno("Pedro",17,8.5f);
        Aluno aluno2 =new Aluno("Caio",18,7.3f);
        Aluno aluno3 =new Aluno("Marcos",17,2.9f);

        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();

        System.out.println("Qual a nova nota do aluno "+aluno1.nome+"?");
        aluno1.atualizarNota(scanner.nextFloat());

        aluno1.exibirInformacoes();
        aluno2.exibirInformacoes();
        aluno3.exibirInformacoes();

        if (aluno1.verificarAprovacao()){
            System.out.println("O aluno "+aluno1.nome+" foi aprovado");
        }else {
            System.out.println("O aluno "+aluno1.nome+" foi reprovado");
        }
        if (aluno2.verificarAprovacao()){
            System.out.println("O aluno "+aluno2.nome+" foi aprovado");
        }else {
            System.out.println("O aluno "+aluno2.nome+" foi reprovado");
        }
        if (aluno3.verificarAprovacao()){
            System.out.println("O aluno "+aluno3.nome+" foi aprovado");
        }else {
            System.out.println("O aluno "+aluno3.nome+" foi reprovado");
        }
    }
}

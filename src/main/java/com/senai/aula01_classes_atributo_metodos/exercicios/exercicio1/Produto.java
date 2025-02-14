package com.senai.aula01_classes_atributo_metodos.exercicios.exercicio1;

import java.util.Scanner;

public class Produto {
    public String nome;
    public double preco;
    public int quantidade;

    public void exebirDetalhes(){
        System.out.println("O produto é: "+nome+".\nSeu preço da unidade é: "+preco+"\nE a quantidade escohida é de: "+quantidade);
    }
    public void atualizarEstoque(int atualizar){
        quantidade += atualizar;
    }
    public void calcularValorEstoque(){
        System.out.println("O valor do estoque é: "+(quantidade * preco));
    }
}
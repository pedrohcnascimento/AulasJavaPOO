package com.senai.aula01_classes_atributo_metodos.exercicios.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Produto produto1 = new Produto();
        Produto produto2 = new Produto();
        produto1.nome = "Perfume Avon";
        produto1.preco = 100.23;
        produto1.quantidade = 3;

        produto2.nome = "Chocolate";
        produto2.preco = 15;
        produto2.quantidade = 5;

        produto1.exebirDetalhes();
        produto1.calcularValorEstoque();
        System.out.println("Você deseja atualizar o estoque de "+produto1.nome+" em quanto?");
        produto1.atualizarEstoque(scanner.nextInt());
        produto1.calcularValorEstoque();

        produto2.exebirDetalhes();
        produto2.calcularValorEstoque();
        System.out.println("Você deseja atualizar o estoque de "+produto2.nome+" em quanto?");

        produto2.atualizarEstoque(scanner.nextInt());
        produto2.calcularValorEstoque();
    }
}

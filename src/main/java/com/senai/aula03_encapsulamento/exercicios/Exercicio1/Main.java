package com.senai.aula03_encapsulamento.exercicios.Exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int opcao;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList <Produto>listaProdutos = new ArrayList<>();
    static int qtdProdutos = 1;
    static int indexLista;

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Seja bem vindo ao sistema!");
        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("""
                    1- Cadastrar novo produto.
                    2- Alterar nome de produto.
                    3- Alterar preço de produto.
                    4- Exibir lista de produtos.
                    0- Encerrar o programa.
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarProduto();
                    break;
                case 2:
                    alterarNome();
                    break;
                case 3:
                    alterarPreco();
                    break;
                case 4:
                    exibirListaProdutos();
                    break;
                case 0:
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
    public static void exibirListaProdutos(){
       for (Produto produto : listaProdutos){
           System.out.println(produto.getID()+produto.getNome()+produto.getPreco());
       }
    }
    public static void cadastrarProduto(){
        Produto novoProduto = new Produto(qtdProdutos,"",0);
        System.out.println("Informe o nome do Produto:");
        novoProduto.setNome(scanner.nextLine());
        System.out.println("Informe o preço do produto:");
        novoProduto.setPreco(scanner.nextDouble());
        listaProdutos.add(novoProduto);
        qtdProdutos++;
    }
    public static void alterarNome(){
        System.out.println("Qual produto você deseja alterar?");
        exibirListaProdutos();
        indexLista = scanner.nextInt()-1;
        scanner.nextLine();
        System.out.println("Informe o novo nome do Produto:");
        listaProdutos.get(indexLista).setNome(scanner.nextLine());
    }
    public static void alterarPreco(){
        System.out.println("Qual produto você deseja alterar?");
        exibirListaProdutos();
        indexLista = scanner.nextInt()-1;
        System.out.println("Informe o preço do produto:");
        listaProdutos.get(indexLista).setPreco(scanner.nextDouble());
    }
}

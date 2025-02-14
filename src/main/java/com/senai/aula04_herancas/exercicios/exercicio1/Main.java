package com.senai.aula04_herancas.exercicios.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int opcao;
    static int opcaoCadastro;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Produto> estoque = new ArrayList<>();
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
                    2- Editar produto.
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
    public static void cadastrarProduto(){
        System.out.println("O produto é um alimento ou eletrônico?");
        System.out.println("""
                1- Eletrônico
                2- Alimento
                """);
        opcaoCadastro = scanner.nextInt();
        do {
            if (opcaoCadastro == 1){
                Eletronico novoProduto = new Eletronico(qtdProdutos,"",0,0,0);
                System.out.println("Por favor, digite o nome do produto:");
                novoProduto.setNome(scanner.nextLine());
                System.out.println("Digite o preço do produto:");
                novoProduto.setPreco(scanner.nextDouble());
                System.out.println("Digite a quantidade adicionada ao estoque:");
                novoProduto.setQuantidade(scanner.nextInt());
                System.out.println("Digite a voltagem do eletrônico:");
                novoProduto.setVoltagem(scanner.nextInt());
                scanner.nextLine();
                estoque.add(novoProduto);
                qtdProdutos++;
            }else if (opcaoCadastro == 2){
                Alimento novoProduto = new Alimento(qtdProdutos,"",0,0,"");
                System.out.println("Por favor, digite o nome do produto:");
                novoProduto.setNome(scanner.nextLine());
                System.out.println("Digite o preço do produto:");
                novoProduto.setPreco(scanner.nextDouble());
                System.out.println("Digite a quantidade adicionada ao estoque:");
                novoProduto.setQuantidade(scanner.nextInt());
                scanner.nextLine();
                System.out.println("Digite a data de validade:");
                novoProduto.setDataDeValidade(scanner.nextLine());
                estoque.add(novoProduto);
                qtdProdutos++;
            } else {
                System.out.println("Opção inválida!");
            }
        }while (opcaoCadastro == 1 || opcaoCadastro ==2);
    }
    public static void alterarNome(){

    }
    public static void alterarPreco(){

    }
    public static void exibirListaProdutos(){
        for (Produto produto : estoque){
            System.out.println(produto);
        }
    }
}

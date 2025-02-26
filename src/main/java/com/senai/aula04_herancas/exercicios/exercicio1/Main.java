package com.senai.aula04_herancas.exercicios.exercicio1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int opcao;
    static int opcaoCadastro;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Produto> estoque = new ArrayList<>();
    static int qtdProdutos = 1;

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
                    3- Deletar produto.
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
                    editarProduto();
                    break;
                case 3:
                    deletarProduto();
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
        scanner.nextLine();
        if (opcaoCadastro == 1){
            Eletronico novoProduto = new Eletronico(qtdProdutos,"",0,0,"");
            System.out.println("Por favor, digite o nome do produto:");
            novoProduto.setNome(scanner.nextLine());
            System.out.println("Digite o preço do produto:");
            novoProduto.setPreco(scanner.nextDouble());
            System.out.println("Digite a quantidade adicionada ao estoque:");
            novoProduto.setQuantidade(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Digite a voltagem do eletrônico:");
            novoProduto.setAtributo(scanner.nextLine());
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
            novoProduto.setAtributo(scanner.nextLine());
            estoque.add(novoProduto);
            qtdProdutos++;
        } else {
            System.out.println("Opção inválida!");
        }
    }
    public static void editarProduto(){
        exibirListaProdutos();
        System.out.println("Digite o id do produto que deseja editar:");
        int opcaoID = scanner.nextInt()-1;
        System.out.println("Que informação você deseja editar?");
        System.out.println("""
                1- Nome
                2- Preço
                3- Quantidade
                4- Voltagem/Data de validade
        """);
        int opcaoEditar = scanner.nextInt();
        scanner.nextLine();
        if (opcaoEditar == 1){
            System.out.println(estoque.get(opcaoID).getNome());
            System.out.println("Digite o novo nome do produto: ");
            estoque.get(opcaoID).setNome(scanner.nextLine());
            System.out.println(estoque.get(opcaoID).getNome());
            System.out.println("Nome alterado com sucesso!");
        } else if (opcaoEditar == 2) {
            System.out.println(estoque.get(opcaoID).getPreco());
            System.out.println("Digite o novo preço do produto: ");
            estoque.get(opcaoID).setPreco(scanner.nextDouble());
            System.out.println(estoque.get(opcaoID).getPreco());
            System.out.println("Preço alterado com sucesso!");
        } else if (opcaoEditar == 3) {
            System.out.println(estoque.get(opcaoID).getQuantidade());
            System.out.println("Digite a nova quantidade do produto: ");
            estoque.get(opcaoID).setQuantidade(scanner.nextInt());
            System.out.println(estoque.get(opcaoID).getQuantidade());
            System.out.println("Quantidade alterada com sucesso!");
        } else if (opcaoEditar == 4) {
            System.out.println(estoque.get(opcaoID).getAtributo());
            System.out.println("Digite o novo atributo do produto:");
            estoque.get(opcaoID).setAtributo(scanner.nextLine());
            System.out.println(estoque.get(opcaoID).getAtributo());
            System.out.println("Voltagem/Data de validade alterada com sucesso!");
        }else {
            System.out.println("Opção inválida!");
        }
    }
    public static void deletarProduto(){
        exibirListaProdutos();
        System.out.println("Digite o id do produto que deseja deletar:");
        estoque.remove(scanner.nextInt()-1);
        System.out.println("Produto retirado da lista com sucesso!");
    }
    public static void exibirListaProdutos(){
        for (Produto produto : estoque){
            System.out.println(produto);
        }
    }
}

package com.senai.aula04_herancas.exercicios.exercicio5;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int opcao;
    static int opcaoCadastro;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Livro> listaLivros = new ArrayList<>();
    static long qtdLivros = 1;

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Seja bem vindo ao sistema!");
        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("""
                    1- Cadastrar novo livro.
                    2- Editar livro.
                    3- Deletar livro.
                    4- Exibir lista de livros.
                    0- Encerrar o programa.
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarLivro();
                    break;
                case 2:
                    editarLivro();
                    break;
                case 3:
                    deletarLivro();
                    break;
                case 4:
                    exibirListaLivros();
                    break;
                case 0:
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
    public static void cadastrarLivro(){
        System.out.println("O livro é físico ou uma cópia online?");
        System.out.println("""
                1- Físico
                2- Online
                """);
        opcaoCadastro = scanner.nextInt();
        scanner.nextLine();
        if (opcaoCadastro == 1){
            LivroFisico novoLivro = new LivroFisico(qtdLivros,"","",0);
            System.out.println("Por favor, digite o título do livro:");
            novoLivro.setTitulo(scanner.nextLine());
            System.out.println("Digite o autor do livro:");
            novoLivro.setAutor(scanner.nextLine());
            System.out.println("Digite o número de páginas: ");
            novoLivro.setAtributo(scanner.nextDouble());
            listaLivros.add(novoLivro);
            qtdLivros++;
        }else if (opcaoCadastro == 2){
            LivroOnline novoLivro = new LivroOnline(qtdLivros,"","",0);
            System.out.println("Por favor, digite o título do livro:");
            novoLivro.setTitulo(scanner.nextLine());
            System.out.println("Digite o autor do livro: ");
            novoLivro.setAutor(scanner.nextLine());
            System.out.println("Digite o tamanho do arquivo: ");
            novoLivro.setAtributo(scanner.nextDouble());
            listaLivros.add(novoLivro);
            qtdLivros++;
        } else {
            System.out.println("Opção inválida!");
        }
    }
    public static void editarLivro(){
        exibirListaLivros();
        System.out.println("Digite o id do livro que deseja editar:");
        int opcaoID = scanner.nextInt()-1;
        System.out.println("Que informação você deseja editar?");
        System.out.println("""
                1- Título
                2- Autor
                3- Número de páginas/tamanho do arquivo
        """);
        int opcaoEditar = scanner.nextInt();
        scanner.nextLine();
        if (opcaoEditar == 1){
            System.out.println(listaLivros.get(opcaoID).getTitulo());
            System.out.println("Digite o novo título do livro: ");
            listaLivros.get(opcaoID).setTitulo(scanner.nextLine());
            System.out.println(listaLivros.get(opcaoID).getTitulo());
            System.out.println("Título alterado com sucesso!");
        } else if (opcaoEditar == 2) {
            System.out.println(listaLivros.get(opcaoID).getAutor());
            System.out.println("Digite o novo autor do livro: ");
            listaLivros.get(opcaoID).setAutor(scanner.nextLine());
            System.out.println(listaLivros.get(opcaoID).getAutor());
            System.out.println("Autor alterado com sucesso!");
        } else if (opcaoEditar == 3) {
            System.out.println(listaLivros.get(opcaoID).getAtributo());
            System.out.println("Digite o novo atributo do pedido: ");
            listaLivros.get(opcaoID).setAtributo(scanner.nextDouble());
            System.out.println(listaLivros.get(opcaoID).getAtributo());
            System.out.println("Número de páginas/tamanho do arquivo alterado com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }
    public static void deletarLivro(){
        exibirListaLivros();
        System.out.println("Digite o id do livro que deseja deletar:");
        listaLivros.remove(scanner.nextInt()-1);
        System.out.println("Livro retirado da lista com sucesso!");
    }
    public static void exibirListaLivros(){
        for (Livro livro : listaLivros){
            System.out.println(livro);
        }
    }

}

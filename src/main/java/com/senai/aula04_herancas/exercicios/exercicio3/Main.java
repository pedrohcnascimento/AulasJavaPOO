package com.senai.aula04_herancas.exercicios.exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int opcao;
    static int opcaoCadastro;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Pedido> listaPedidos = new ArrayList<>();
    static long qtdPedidos = 1;

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Seja bem vindo ao sistema!");
        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("""
                    1- Fazer novo pedido.
                    2- Editar pedido.
                    3- Deletar pedido.
                    4- Exibir lista de pedidos.
                    0- Encerrar o programa.
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    fazerPedido();
                    break;
                case 2:
                    editarPedidos();
                    break;
                case 3:
                    deletarPedido();
                    break;
                case 4:
                    exibirListaPedidos();
                    break;
                case 0:
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
    public static void fazerPedido(){
        System.out.println("O pedido é online ou presencial?");
        System.out.println("""
                1- Online
                2- Presencial
                """);
        opcaoCadastro = scanner.nextInt();
        scanner.nextLine();
        if (opcaoCadastro == 1){
            PedidoOnline novoPedido = new PedidoOnline(qtdPedidos,0,0);
            System.out.println("Por favor, digite o valor do pedido:");
            novoPedido.setValortotal(scanner.nextDouble());
            System.out.println("Digite a taxa de entrega:");
            novoPedido.setAtributo(scanner.nextDouble());
            listaPedidos.add(novoPedido);
            qtdPedidos++;
        }else if (opcaoCadastro == 2){
            PedidoPresencial novoPedido = new PedidoPresencial(qtdPedidos,0,0);
            System.out.println("Por favor, digite o valor do pedido:");
            novoPedido.setValortotal(scanner.nextDouble());
            System.out.println("Digite o valor do desconto a vista:");
            novoPedido.setAtributo(scanner.nextDouble());
            listaPedidos.add(novoPedido);
            qtdPedidos++;
        } else {
            System.out.println("Opção inválida!");
        }
    }
    public static void editarPedidos(){
        exibirListaPedidos();
        System.out.println("Digite o id do pedido que deseja editar:");
        int opcaoID = scanner.nextInt()-1;
        System.out.println("Que informação você deseja editar?");
        System.out.println("""
                1- Valor total
                2- Taxa de entrega/Desconto
        """);
        int opcaoEditar = scanner.nextInt();
        scanner.nextLine();
        if (opcaoEditar == 1){
            System.out.println(listaPedidos.get(opcaoID).getValortotal());
            System.out.println("Digite o novo valor do pedido: ");
            listaPedidos.get(opcaoID).setValortotal(scanner.nextDouble());
            System.out.println(listaPedidos.get(opcaoID).getValortotal());
            System.out.println("Valor alterado com sucesso!");
        } else if (opcaoEditar == 2) {
            System.out.println(listaPedidos.get(opcaoID).getAtributo());
            System.out.println("Digite o novo atributo do pedido: ");
            listaPedidos.get(opcaoID).setAtributo(scanner.nextDouble());
            System.out.println(listaPedidos.get(opcaoID).getAtributo());
            System.out.println("Taxa de entrega/desconto alterado com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }
    public static void deletarPedido(){
        exibirListaPedidos();
        System.out.println("Digite o id do pedido que deseja deletar:");
        listaPedidos.remove(scanner.nextInt()-1);
        System.out.println("Pedido retirado da lista com sucesso!");
    }
    public static void exibirListaPedidos(){
        for (Pedido pedido : listaPedidos){
            System.out.println(pedido);
        }
    }
}

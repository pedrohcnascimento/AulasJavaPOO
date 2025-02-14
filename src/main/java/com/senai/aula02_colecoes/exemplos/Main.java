package com.senai.aula02_colecoes.exemplos;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static ArrayList<Tarefa> tarefas = new ArrayList<>();
    public static int opcao;
    public static int indice;
    public static String nomeTarefa;

    public static void main(String[] args) {
        do {
            System.out.println("----Gerenciador de tarefas------");
            System.out.println("""
                1-Adicionar tarefa.
                2-Listar tarefas.
                3-Marcar tarefa como concluída.
                4-Remover tarefa.
                5-Sair.
                ---------------------------------
                """);
            System.out.print("Escolha uma opção:");
            opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    adicionarTarefas();
                    break;
                case 2:
                    listarTarefas();
                    break;
                case 3:
                    concluirTarefa();
                    break;
                case 4:
                    removerTarefa();
                    break;
                case 5:
                    System.out.println("Sistema encerrado");
                    scanner.close();
                    break;
            }
        }while (opcao != 5);
    }
    public static void adicionarTarefas(){
        System.out.println("Quantas tarefas deseja adicionar?");
        int qntTarefas = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= qntTarefas; i++) {
            System.out.println("Digite o nome da "+i+"° tarefa:");
            nomeTarefa = scanner.nextLine();
            tarefas.add(new Tarefa(nomeTarefa, false));
        }
        System.out.println("Tarefas adicionadas com sucesso!!!");
        listarTarefas();
        System.out.println();
    }
    public static void listarTarefas(){
        for (Tarefa tarefa : tarefas){
            System.out.println((tarefas.indexOf(tarefa)+1)+"-"+tarefas);
        }
        System.out.println();
    }
    public static void concluirTarefa(){
        System.out.println("Qual o numero da tarefa que foi concluida?");
        indice = scanner.nextInt();
        tarefas.get(indice-1).statusConclusao=true;
        System.out.println("Tarefa marcada como concluída com sucesso!!!");
        listarTarefas();
        System.out.println();
    }
    public static void removerTarefa(){
        System.out.println("Qual tarefa deve ser removida da lista?");
        indice = scanner.nextInt();
        tarefas.remove(indice-1);
        System.out.println("Tarefa removida da lista com sucesso!!!");
        listarTarefas();
        System.out.println();
    }
}

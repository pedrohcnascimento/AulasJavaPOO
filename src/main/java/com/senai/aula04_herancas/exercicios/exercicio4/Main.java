package com.senai.aula04_herancas.exercicios.exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int opcao;
    static int opcaoCadastro;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Paciente> listaPacientes = new ArrayList<>();
    static long qtdPacientes = 1;

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Seja bem vindo ao sistema!");
        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("""
                    1- Cadastrar novo paciente.
                    2- Editar paciente.
                    3- Deletar paciente.
                    4- Exibir lista de pacientes.
                    0- Encerrar o programa.
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarPacientes();
                    break;
                case 2:
                    editarPaciente();
                    break;
                case 3:
                    deletarPaciente();
                    break;
                case 4:
                    exibirListaPacientes();
                    break;
                case 0:
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
    public static void cadastrarPacientes(){
        System.out.println("O paciente é do convênio ou se tratará em hospital privado?");
        System.out.println("""
                1- Convênio
                2- Privado
                """);
        opcaoCadastro = scanner.nextInt();
        scanner.nextLine();
        if (opcaoCadastro == 1){
            Paciente novoPaciente = new PacienteConvenio(qtdPacientes,"",0,0);
            System.out.println("Por favor, digite o nome do paciente:");
            novoPaciente.setNome(scanner.nextLine());
            System.out.println("Digite a idade do paciente:");
            novoPaciente.setIdade(scanner.nextInt());
            System.out.println("Digite o desconto do convênio: ");
            novoPaciente.setAtributo(scanner.nextDouble());
            listaPacientes.add(novoPaciente);
            qtdPacientes++;
        }else if (opcaoCadastro == 2){
            Paciente novoPaciente = new PacienteParticular(qtdPacientes,"",0,0);
            System.out.println("Por favor, digite o nome do paciente:");
            novoPaciente.setNome(scanner.nextLine());
            System.out.println("Digite a idade do paciente: ");
            novoPaciente.setIdade(scanner.nextInt());
            System.out.println("Digite o valor da consulta: ");
            novoPaciente.setAtributo(scanner.nextDouble());
            listaPacientes.add(novoPaciente);
            qtdPacientes++;
        } else {
            System.out.println("Opção inválida!");
        }
    }
    public static void editarPaciente(){
        exibirListaPacientes();
        System.out.println("Digite o id do paciente que deseja editar:");
        int opcaoID = scanner.nextInt()-1;
        System.out.println("Que informação você deseja editar?");
        System.out.println("""
                1- Nome
                2- Idade
                3- Desconto no custo/Preço da consulta
        """);
        int opcaoEditar = scanner.nextInt();
        scanner.nextLine();
        if (opcaoEditar == 1){
            System.out.println(listaPacientes.get(opcaoID).getNome());
            System.out.println("Digite o novo nome do paciente: ");
            listaPacientes.get(opcaoID).setNome(scanner.nextLine());
            System.out.println(listaPacientes.get(opcaoID).getNome());
            System.out.println("Nome alterado com sucesso!");
        } else if (opcaoEditar == 2) {
            System.out.println(listaPacientes.get(opcaoID).getIdade());
            System.out.println("Digite a nova idade do paciente: ");
            listaPacientes.get(opcaoID).setIdade(scanner.nextInt());
            System.out.println(listaPacientes.get(opcaoID).getIdade());
            System.out.println("Idade alterada com sucesso!");
        } else if (opcaoEditar == 3) {
            System.out.println(listaPacientes.get(opcaoID).getAtributo());
            System.out.println("Digite o novo atributo do pedido: ");
            listaPacientes.get(opcaoID).setAtributo(scanner.nextDouble());
            System.out.println(listaPacientes.get(opcaoID).getAtributo());
            System.out.println("Desconto no custo/Preço da consulta alterada com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }
    public static void deletarPaciente(){
        exibirListaPacientes();
        System.out.println("Digite o id do paciente que deseja deletar:");
        listaPacientes.remove(scanner.nextInt()-1);
        System.out.println("Paciente retirado da lista com sucesso!");
    }
    public static void exibirListaPacientes(){
        for (Paciente paciente : listaPacientes){
            System.out.println(paciente);
        }
    }
}

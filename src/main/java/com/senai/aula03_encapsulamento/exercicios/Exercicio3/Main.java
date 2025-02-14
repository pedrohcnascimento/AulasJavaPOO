package com.senai.aula03_encapsulamento.exercicios.Exercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //inicia variáveis usadas em mais de um lugar
    static Scanner scanner = new Scanner(System.in);
    static int opcaoMenu;
    static int opcaoCargo;
    static int indexLista;
    static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    static int qtdFuncionario = 1;
    static String[] cargos = {
            "Gerente",
            "Analista",
            "Programador"
    };

    public static void main(String[] args) {
       menu();
    }
    static void  menu(){
        System.out.println("Seja bem vindo ao sistema!");

        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("""
                    1- Cadastrar novo funcionário.
                    2- Alterar nome do funcionário.
                    3- Alterar salário do funcionário.
                    4- Alterar cargo do funcionário.
                    5- Exibir lista de funcionários.
                    0- Encerrar o programa.
                    """);
            opcaoMenu = scanner.nextInt();
            scanner.nextLine();
            switch (opcaoMenu) {
                case 1:
                    //Cria novo objeto(funcionário) e adiciona a listaFuncionarios
                    cadastrarFuncionario();
                    break;
                case 2:
                    //Altera nome de funcionário escolhido da lista
                    alterarNome();
                    break;
                case 3:
                    //Altera salário de funcionário escolhido da lista
                    alterarSalario();
                    break;
                case 4:
                    //Altera cargo de funcionário escolhido da lista
                    alterarCargo();
                    break;
                case 5:
                    exibirListaFuncionarios();
                    break;
                case 0:
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcaoMenu != 0);
    }
    public static void exibirListaFuncionarios(){
        for (Funcionario funcionario : listaFuncionarios){
            System.out.println("Funcionário "+funcionario.getID()+"- Nome: "+funcionario.getNome()+" Salário: "+funcionario.getSalario()+" Cargo: "+funcionario.getCargo());
        }
    }
    public static void cadastrarFuncionario(){
        //O atributo preenchido por "qtdFuncionario" é o ID do funcionário (é preenchido automaticamente)
        Funcionario novoFuncionario = new Funcionario(qtdFuncionario,"",0,"");
        //Enquanto os métodos ".set" retornarem falsos o usuário será requisitado um novvo preenchimento válido
        do {
            System.out.println("Informe o nome do funcionário:");
        }while (!novoFuncionario.setNome(scanner.nextLine()));
        do {
            System.out.println("Informe o salário do funcionário:");
        }while (!novoFuncionario.setSalario(scanner.nextDouble()));
        //Loop obriga usuário a escolher entre os cargos da matriz "cargos"
        do {
            System.out.println("Informe o cargo do funcionário: ");
            for (int i = 0; i < cargos.length; i++) {
                System.out.println((i + 1) + "-" + cargos[i]);
            }
            opcaoCargo = scanner.nextInt();
            scanner.nextLine();
        }while (opcaoCargo < 1 || opcaoCargo > 3);
        novoFuncionario.setCargo(cargos[opcaoCargo -1]);
        //Adiciona funcionário com as informações preenchidas pelo usuário a lista
        listaFuncionarios.add(novoFuncionario);
        qtdFuncionario++;
    }
    public static void alterarNome(){
        System.out.println("Qual funcionário você deseja alterar?");
        exibirListaFuncionarios();
        indexLista = scanner.nextInt()-1;
        scanner.nextLine();
        //Enquanto o métodos .setNome retornar falso o usuário será requisitado um novvo preenchimento válido
        do {
            System.out.println("Informe o novo nome do funcionário:");
        }while (!listaFuncionarios.get(indexLista).setNome(scanner.nextLine()));
    }
    public static void alterarSalario(){
        System.out.println("Qual funcionário você deseja alterar?");
        exibirListaFuncionarios();
        indexLista = scanner.nextInt()-1;
        //Enquanto o métodos .setSalario retornar falso o usuário será requisitado um novvo preenchimento válido
        do {
            System.out.println("Informe o novo salário do funcionário:");
        }while (!listaFuncionarios.get(indexLista).setSalario(scanner.nextDouble()));
    }
    public static void alterarCargo(){
        System.out.println("Qual funcionário você deseja alterar?");
        exibirListaFuncionarios();
        indexLista = scanner.nextInt()-1;
        //Loop obriga usuário a escolher entre os cargos da matriz "cargos"
        do {
            System.out.println("Escolha uma das opções de cargo:");
            for (int i = 0; i < cargos.length; i++) {
                System.out.println((i + 1) + "-" + cargos[i]);
            }
            opcaoCargo = scanner.nextInt();
        }while (opcaoCargo < 1 || opcaoCargo > 3);
        listaFuncionarios.get(indexLista).setCargo(cargos[opcaoCargo -1]);
        scanner.nextLine();
    }
}

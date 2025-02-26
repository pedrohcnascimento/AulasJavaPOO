package com.senai.aula04_herancas.exercicios.exercicio2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static int opcao;
    static int opcaoCadastro;
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
    static int qtdFuncionarios = 1;

    public static void main(String[] args) {
        menu();
    }
    public static void menu(){
        System.out.println("Seja bem vindo ao sistema!");
        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("""
                    1- Cadastrar novo funcionário.
                    2- Editar funcionário.
                    3- Deletar funcionário.
                    4- Exibir lista de funcionários.
                    0- Encerrar o programa.
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    cadastrarFuncionario();
                    break;
                case 2:
                    editarFucionarios();
                    break;
                case 3:
                    deletarFuncionario();
                    break;
                case 4:
                    exibirListaFuncionarios();
                    break;
                case 0:
                    scanner.close();
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (opcao != 0);
    }
    public static void cadastrarFuncionario(){
        System.out.println("O Funcionário é um coordenador ou professor?");
        System.out.println("""
                1- Coordenador
                2- Professor
                """);
        opcaoCadastro = scanner.nextInt();
        scanner.nextLine();
        if (opcaoCadastro == 1){
            Coordenador novoFuncionario = new Coordenador(qtdFuncionarios,"",0,"");
            System.out.println("Por favor, digite o nome do funcionário:");
            novoFuncionario.setNome(scanner.nextLine());
            System.out.println("Digite o salário do funcionário:");
            novoFuncionario.setSalario(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Digite qual a equipe de professores ele é responsável:");
            novoFuncionario.setAtributo(scanner.nextLine());
            listaFuncionarios.add(novoFuncionario);
            qtdFuncionarios++;
        }else if (opcaoCadastro == 2){
            Professor novoFuncionario = new Professor(qtdFuncionarios,"",0,"");
            System.out.println("Por favor, digite o nome do funcionário:");
            novoFuncionario.setNome(scanner.nextLine());
            System.out.println("Digite o salário do funcionário:");
            novoFuncionario.setSalario(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Digite a disciplina do funcionário:");
            novoFuncionario.setAtributo(scanner.nextLine());
            listaFuncionarios.add(novoFuncionario);
            qtdFuncionarios++;
        } else {
            System.out.println("Opção inválida!");
        }
    }
    public static void editarFucionarios(){
        exibirListaFuncionarios();
        System.out.println("Digite o id do funcionário que deseja editar:");
        int opcaoID = scanner.nextInt()-1;
        System.out.println("Que informação você deseja editar?");
        System.out.println("""
                1- Nome
                2- Salário
                3- Equipe de professores/Disciplina
        """);
        int opcaoEditar = scanner.nextInt();
        scanner.nextLine();
        if (opcaoEditar == 1){
            System.out.println(listaFuncionarios.get(opcaoID).getNome());
            System.out.println("Digite o novo nome do funcionário: ");
            listaFuncionarios.get(opcaoID).setNome(scanner.nextLine());
            System.out.println(listaFuncionarios.get(opcaoID).getNome());
            System.out.println("Nome alterado com sucesso!");
        } else if (opcaoEditar == 2) {
            System.out.println(listaFuncionarios.get(opcaoID).getSalario());
            System.out.println("Digite o novo salário do funcionário: ");
            listaFuncionarios.get(opcaoID).setSalario(scanner.nextDouble());
            System.out.println(listaFuncionarios.get(opcaoID).getSalario());
            System.out.println("Salário alterado com sucesso!");
        } else if (opcaoEditar == 3) {
            System.out.println(listaFuncionarios.get(opcaoID).getAtributo());
            System.out.println("Digite o novo atributo do funcionário: ");
            listaFuncionarios.get(opcaoID).setAtributo(scanner.nextLine());
            System.out.println(listaFuncionarios.get(opcaoID).getAtributo());
            System.out.println("Equipe de professores/Disciplina alterada com sucesso!");
        } else {
            System.out.println("Opção inválida!");
        }
    }
    public static void deletarFuncionario(){
        exibirListaFuncionarios();
        System.out.println("Digite o id do funcionário que deseja deletar:");
        listaFuncionarios.remove(scanner.nextInt()-1);
        System.out.println("Funcionário retirado da lista com sucesso!");
    }
    public static void exibirListaFuncionarios(){
        for (Funcionario funcionario : listaFuncionarios){
            System.out.println(funcionario);
        }
    }
}

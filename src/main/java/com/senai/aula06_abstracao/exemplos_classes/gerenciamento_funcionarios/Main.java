package com.senai.aula06_abstracao.exemplos_classes.gerenciamento_funcionarios;

public class Main {
    public static void main(String[] args) {
        testeFuncionario(new FuncionarioEfetivo("Pedro", 15000,2500));
        testeFuncionario(new FuncionarioTemporario("Kauan", 1000, 1000, 50));
    }

    private static void testeFuncionario(Funcionario funcionario){
        System.out.println("---------Teste funcionarios------------");
        funcionario.exibirDados();
        funcionario.calcularBonus();
        funcionario.exibirDados();
        funcionario.aumentarSalario(20);
        funcionario.exibirDados();
    }
}

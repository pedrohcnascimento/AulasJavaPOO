package com.senai.aula01_classes_atributo_metodos.exemplos.pessoa;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pessoa pessoa01 = new Pessoa("Pedro", new Endereco("SP","Guaianazes","Dr.João Leal da Costa",283,123456), 17);
        Pessoa pessoa02 = new Pessoa("Kauan",new Endereco("Xique-Xique","Lapa","Lucas Machado Pinto",154,123456),18);
        Pessoa pessoa03 = new Pessoa("Rafael",new Endereco("Londres","Capão","Sherlock Holmes",69,123456),40);

        System.out.println(pessoa01);
        System.out.println(pessoa02);
        System.out.println(pessoa01==pessoa02);
        System.out.println(pessoa01.equals(pessoa02));
        System.out.println(pessoa03);

        Pessoa[] pessoas = new Pessoa[3];
        pessoas[0] = pessoa01;
        pessoas[1] = pessoa02;
        pessoas[2] = pessoa03;

        ArrayList pessoasList = new ArrayList<>();

        pessoasList.add(pessoa01);
        pessoasList.add(pessoa02);
        pessoasList.add(pessoa03);
        pessoasList.add("teste");
        pessoasList.add(176);
        pessoasList.add(true);

        System.out.println(pessoasList.get(4));

        pessoasList.remove(4);

        System.out.println(pessoasList.get(4));
        pessoasList.clear();
        System.out.println(pessoasList);
    }
}
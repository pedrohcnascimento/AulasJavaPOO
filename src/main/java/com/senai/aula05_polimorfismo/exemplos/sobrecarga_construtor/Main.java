package com.senai.aula05_polimorfismo.exemplos.sobrecarga_construtor;

public class Main {
    public static void main(String[] args) {
        Produto produto1 =new Produto("Arroz");
        Produto produto2 =new Produto("Feijão",64.32);
        Produto produto3 =new Produto("Sal",12.23,4);
        Produto produto4 = new Produto();

        System.out.println(produto1);
        System.out.println(produto2);
        System.out.println(produto3);
        System.out.println(produto4);
    }
}

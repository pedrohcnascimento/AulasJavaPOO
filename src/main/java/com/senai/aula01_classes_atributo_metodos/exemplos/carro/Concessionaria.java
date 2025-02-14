package com.senai.aula01_classes_atributo_metodos.exemplos.carro;

public class Concessionaria {
    public static void main(String[] args) {
        Carro carro1 = new Carro("AMG Brabus GT R C190");
        Carro carro2 = new Carro("Logan");
        Carro carro3 = new Carro("Kwid");

        carro1.marca = "Mercedez Benz";
        carro1.placa = "P 7";
        carro1.precoBase = 2400000;
        carro1.anoFabricacao = 2016;
        carro1.qntPortas = 2;
        carro1.cor = "Preto";

        carro1.ligarCarro();
        carro1.consultarPlaca();
        carro1.testarSom();
        carro1.verificarInformacoes();
        carro1.consultarPreco(2024);

        System.out.println();

        carro2.marca = "Renault";
        carro2.modelo = "Logan";
        carro2.placa = "XXX 1111";
        carro2.precoBase = 57000;
        carro2.anoFabricacao = 2016;
        carro2.qntPortas = 4;
        carro2.cor = "Prata";

        carro2.ligarCarro();
        carro2.consultarPlaca();
        carro2.testarSom();
        carro2.verificarInformacoes();
        carro2.consultarPreco(2024);

        System.out.println();

        carro3.marca = "Renault";
        carro3.modelo = "Logan";
        carro3.placa = "XXX 1111";
        carro3.precoBase = 57000;
        carro3.anoFabricacao = 2016;
        carro3.qntPortas = 4;
        carro3.cor = "Prata";

        carro3.ligarCarro();
        carro3.consultarPlaca();
        carro3.testarSom();
        carro3.verificarInformacoes();
        carro3.consultarPreco(2024);

        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);

        carro1 = carro2;
        System.out.println();
        System.out.println(carro1);
        System.out.println(carro2);
        System.out.println(carro3);
        System.out.println(carro1.equals(carro2));
        System.out.println(carro2.equals(carro3));
    }
}

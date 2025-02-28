package com.senai.aula05_polimorfismo.exercicios.exercicio1;

public class Main {

    public static void main(String[] args) {
        Relatorio[] relatorios = {
                new CSV(1,"Contabilidade",20,""),
                new PDF(2,"Funcionarios",10,""),
                new JSON(3, "Clientes", 120, "")
        };

        for (Relatorio r : relatorios){
            r.setExtensaoArquivo("");
            r.gerarRelatorio();
        }
    }
}

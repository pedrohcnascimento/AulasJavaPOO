package com.senai.aula06_abstracao.exemplos_interfaces.aparelhos_eletronicos;

public class Main {
    public static void main(String[] args) {

        System.out.println("Testando TV");
        ligarEDeslgarAparelhos(new Televisao());

        System.out.println("Testando computador");
        ligarEDeslgarAparelhos(new Computador());
    }

    public static void ligarEDeslgarAparelhos(AparelhoEletronico aparelhoEletronico){
        aparelhoEletronico.ligar();
        aparelhoEletronico.desligar();
    }
}

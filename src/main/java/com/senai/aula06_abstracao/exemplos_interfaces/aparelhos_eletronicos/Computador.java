package com.senai.aula06_abstracao.exemplos_interfaces.aparelhos_eletronicos;

public class Computador implements AparelhoEletronico{

    @Override
    public void ligar() {
        System.out.println("Computador ligado!");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado!");
    }
}

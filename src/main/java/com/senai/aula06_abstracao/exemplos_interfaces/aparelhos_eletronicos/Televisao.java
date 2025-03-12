package com.senai.aula06_abstracao.exemplos_interfaces.aparelhos_eletronicos;

public class Televisao implements AparelhoEletronico{

    @Override
    public void ligar() {
        System.out.println("TV ligada!");
    }

    @Override
    public void desligar() {
        System.out.println("TV desligada!");
    }
}

package com.senai.aula06_abstracao.exemplos_interfaces.controle_aparelho_inteligente;

public class LampadaInteligente implements AparelhoInteligente{
    private int brilho;

    public  LampadaInteligente() {
        this.brilho = 0;
    }

    public void ligar() {
        System.out.println("Lampada ligada!");
    }

    public void desligar() {
        System.out.println("Lampada desligada!");
    }

    public void aumentarBrilho() {
        System.out.println("Brilho " + (brilho = ajustarNivel(brilho, 1)));
    }

    public void diminuirBrilho(){
        System.out.println("Brilho " + (brilho = ajustarNivel(brilho, -1)));
    }
}

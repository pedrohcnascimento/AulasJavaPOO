package com.senai.aula06_abstracao.exemplos_interfaces.controle_aparelho_inteligente;

public class Main {
    public static void main(String[] args) {
        testarAparelhoInteligente(new LampadaInteligente());
        testarAparelhoInteligente(new TvSmart());
    }
    private static void testarAparelhoInteligente(AparelhoInteligente aparelhoInteligente){
        System.out.println("---------------Teste aparelhos-----------------");
        aparelhoInteligente.ligar();
        if (aparelhoInteligente instanceof TvSmart tvSmart){
            tvSmart.aumentarVolume();
            tvSmart.diminuirVolume();
        }else if (aparelhoInteligente instanceof LampadaInteligente lampada){
            lampada.aumentarBrilho();
            lampada.diminuirBrilho();
        }
        aparelhoInteligente.desligar();
    }
}

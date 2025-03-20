package com.senai.aula06_abstracao.exemplos_interfaces.controle_aparelho_inteligente;

public class TvSmart implements AparelhoInteligente{
    private int volume;

    public TvSmart(){
        this.volume = 0;
    }

    public void ligar() {
        System.out.println("TV ligada!");
    }

    public void desligar() {
        System.out.println("TV desligada!");
    }

    public void aumentarVolume(){
        System.out.println("Volume " + (volume = ajustarNivel(volume , 1)));
    }

    public void diminuirVolume(){
        System.out.println("Volume " + (volume = ajustarNivel(volume , -1)));
    }
}

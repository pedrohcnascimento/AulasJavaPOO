package com.senai.aula06_abstracao.exemplos_classes.veiculos;

public class Moto extends Veiculo{
    public Moto(int velocidade) {
        super(velocidade);
    }

    @Override
    void ligar() {
        System.out.println("Moto ligada!");
    }
}

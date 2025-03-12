package com.senai.aula06_abstracao.exemplos_classes.veiculos;

public class Carro extends Veiculo{
    public Carro(int velocidade) {
        super(velocidade);
    }

    @Override
    void ligar() {
        System.out.println("Carro ligado!");
    }
}

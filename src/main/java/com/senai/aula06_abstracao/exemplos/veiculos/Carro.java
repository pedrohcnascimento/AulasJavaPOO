package com.senai.aula06_abstracao.exemplos.veiculos;

public class Carro extends Veiculo{
    public Carro(int velocidade) {
        super(velocidade);
    }

    @Override
    void ligar() {
        System.out.println("Carro ligado!");
    }
}

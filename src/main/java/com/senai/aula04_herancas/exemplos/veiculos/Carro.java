package com.senai.aula04_herancas.exemplos.veiculos;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, int ano, int portas) {
        super(marca, ano);
        this.portas = portas;
    }

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    void exibirdetalhes() {
        super.exibirdetalhes();
        System.out.println("Portas: "+portas);
    }
}
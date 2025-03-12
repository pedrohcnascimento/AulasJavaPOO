package com.senai.aula06_abstracao.exemplos_interfaces.veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo = new Carro();

        veiculo.acelerar();
        veiculo.buzinar();
    }
}

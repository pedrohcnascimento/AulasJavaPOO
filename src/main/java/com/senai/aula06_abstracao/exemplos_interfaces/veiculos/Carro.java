package com.senai.aula06_abstracao.exemplos_interfaces.veiculos;

public class Carro implements Veiculo{
    @Override
    public void acelerar() {
        System.out.println("Acelerando o carro");
    }
}

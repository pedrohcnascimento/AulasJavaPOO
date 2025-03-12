package com.senai.aula06_abstracao.exemplos_interfaces.veiculos;

public interface Veiculo {
    void acelerar();

    default void buzinar(){
        System.out.println("Sai da frente!!! BiiiBiiiiiiiii!");
    }
}

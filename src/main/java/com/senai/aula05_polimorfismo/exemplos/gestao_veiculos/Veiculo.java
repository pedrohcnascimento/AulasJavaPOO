package com.senai.aula05_polimorfismo.exemplos.gestao_veiculos;

public class Veiculo {
    private String modelo;

    public Veiculo(String modelo) {
        this.modelo = modelo;
    }

    public void realizarManutencao(){
        System.out.println("Manutenção genérica");
    }

    public String getModelo() {
        return modelo;
    }
}

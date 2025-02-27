package com.senai.aula05_polimorfismo.exemplos.gestao_veiculos;

public class Main {
    public static void main(String[] args) {
        Veiculo[] frota = {
                new Carro("Corolla"),
                new Moto("Harley Davidson"),
                new Caminhao("Volvo FH")
        };

        for (Veiculo v : frota){
            v.realizarManutencao();
        }
    }
}

package com.senai.aula01_classes_atributo_metodos.exemplos.carro;

import java.util.Objects;

public class Carro {
    String marca;
    String modelo;
    String placa;
    byte qntPortas;
    String cor;
    double precoBase;
    int anoFabricacao;

    Carro(String modelo){
        this.modelo = modelo;
    }

    public Carro(String marca, String modelo, String placa, byte qntPortas, String cor, double precoBase, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.qntPortas = qntPortas;
        this.cor = cor;
        this.precoBase = precoBase;
        this.anoFabricacao = anoFabricacao;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", placa='" + placa + '\'' +
                ", qntPortas=" + qntPortas +
                ", cor='" + cor + '\'' +
                ", precoBase=" + precoBase +
                ", anoFabricacao=" + anoFabricacao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carro carro = (Carro) o;
        return qntPortas == carro.qntPortas && Double.compare(precoBase, carro.precoBase) == 0 && anoFabricacao == carro.anoFabricacao && Objects.equals(marca, carro.marca) && Objects.equals(modelo, carro.modelo) && Objects.equals(placa, carro.placa) && Objects.equals(cor, carro.cor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, placa, qntPortas, cor, precoBase, anoFabricacao);
    }

    public void verificarInformacoes(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Placa: "+placa);
        System.out.println("Quantidade de portas: "+qntPortas);
        System.out.println("Cor: "+cor);
    }
    public void ligarCarro(){
        System.out.println("Vruuum");
    }
    public void testarSom(){
        System.out.println("The bluetooth device has been connected.");
    }
    public void consultarPlaca(){
        System.out.println("A placa "+placa+" está sem restrições.");
    }
    public void consultarPreco(int anoAtual){
        int idadeDoCarro = anoAtual - anoFabricacao;
        double precoAtual = precoBase;
        if (idadeDoCarro > 0){
            for (int i = 0; i < idadeDoCarro; i++) {
                precoAtual -= precoAtual * 0.05;
            }
        }
        System.out.printf("O valor do %s %s é: %.2f \n",marca,modelo,precoAtual);
    }
}
package com.senai.aula04_herancas.exemplos.veiculos;

public class Veiculo {
    private String marca;
    private int ano;

    public Veiculo(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    void exibirdetalhes(){
        System.out.println("Marca: "+marca+"\nAno: "+ano);
    }
}
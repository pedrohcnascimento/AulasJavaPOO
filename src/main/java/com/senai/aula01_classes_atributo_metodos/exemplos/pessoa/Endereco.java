package com.senai.aula01_classes_atributo_metodos.exemplos.pessoa;

import java.util.Objects;

public class Endereco {
    String cidade;
    String bairro;
    String rua;
    int Numero;
    int cep;

    public Endereco(String cidade, String bairro, String rua, int numero, int cep) {
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        Numero = numero;
        this.cep = cep;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return Numero == endereco.Numero && cep == endereco.cep && Objects.equals(cidade, endereco.cidade) && Objects.equals(bairro, endereco.bairro) && Objects.equals(rua, endereco.rua);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cidade, bairro, rua, Numero, cep);
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "cidade='" + cidade + '\'' +
                ", bairro='" + bairro + '\'' +
                ", rua='" + rua + '\'' +
                ", Numero=" + Numero +
                ", cep=" + cep +
                '}';
    }
}

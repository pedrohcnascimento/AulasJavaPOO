package com.senai.aula01_classes_atributo_metodos.exemplos.pessoa;

import java.util.Objects;

public class Pessoa {
    String nome;
    Endereco endereco;
    int idade;

    public String toString(){
        return "O nome da pessoa é "+nome+"\nEla tem "+idade+" anos\nmora no endereço:"+endereco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade && Objects.equals(nome, pessoa.nome) && Objects.equals(endereco, pessoa.endereco);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, endereco, idade);
    }

    public Pessoa(String nome, Endereco endereco, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }
}
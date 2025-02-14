package com.senai.aula02_colecoes.exemplos;

public class Tarefa {
    public String nomeTarefa;
    public boolean statusConclusao;

    public Tarefa(String nomeTarefa, boolean statusConclusao) {
        this.nomeTarefa = nomeTarefa;
        this.statusConclusao = statusConclusao;
    }

    @Override
    public String toString() {
        return String.format("%s - [%s]",nomeTarefa,statusConclusao?"Concluida":"Pendente");
    }
}

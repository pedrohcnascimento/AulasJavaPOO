package com.senai.aula06_abstracao.Exercicios.exercicio1;

public class Gol implements CheckIn{
    private int numeroDoPassaporte;
    private int numeroDaPassagem;
    private String nome;
    private String nomeNoDocumento;

    public Gol(int numeroDoPassaporte, int numeroDaPassagem, String nome, String nomeNoDocumento) {
        this.numeroDoPassaporte = numeroDoPassaporte;
        this.numeroDaPassagem = numeroDaPassagem;
        this.nome = nome;
        this.nomeNoDocumento = nomeNoDocumento;
    }

    @Override
    public boolean validarDocumentos() {
        if (numeroDoPassaporte == numeroDaPassagem && nome.equals(nomeNoDocumento)){
            System.out.println("Documentos válidos!");
            return true;
        } else {
            System.out.println("Documentos inválidos!");
            return false;
        }
    }

    @Override
    public void emitirCartaoEmbarque(boolean verificarBagagens) {
        if (validarDocumentos() && verificarBagagens){
            System.out.println("Cartão de embarque emitido com sucesso pela empresa Gol!");
        } else {
            System.out.println("Cartão de embarque recusado!");
        }
    }
}

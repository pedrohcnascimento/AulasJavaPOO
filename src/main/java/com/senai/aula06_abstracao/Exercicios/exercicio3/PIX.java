package com.senai.aula06_abstracao.Exercicios.exercicio3;

public class PIX extends Pagamento{
    private int codigoPix;

    public PIX(int senha, String nomeUser, double saldo, int codigoPix) {
        super(senha, nomeUser, saldo);
        this.codigoPix = codigoPix;
    }

    @Override
    public void validacaoAntiFraude(int numero) {
        if (numero == codigoPix){
            System.out.println("Codigó pix verificado com sucesso!");
        } else {
            System.out.println("Código pix inválidor! Fraude detectada!");
        }
    }

    @Override
    public void registroDeTransacao() {
        System.out.println("Pix: "+codigoPix+" realizado por: "+nomeUser);
    }
}

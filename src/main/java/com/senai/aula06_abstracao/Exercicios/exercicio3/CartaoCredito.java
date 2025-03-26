package com.senai.aula06_abstracao.Exercicios.exercicio3;

public class CartaoCredito extends Pagamento{
    private int numeroCartao;

    public CartaoCredito(int senha, String nomeUser, double saldo, int numeroCartao) {
        super(senha, nomeUser, saldo);
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void validacaoAntiFraude(int numero) {
        if (numeroCartao == numero){
            System.out.println("Cartão válido!");
        } else {
            System.out.println("Numero do cartão invalido! Fraude detectada");
        }
    }

    @Override
    public void registroDeTransacao() {
        System.out.println("Transação relizada por: "+nomeUser+" no cartão com código: "+numeroCartao);
    }
}

package com.senai.aula06_abstracao.Exercicios.exercicio3;

public class CarteiraDigital extends Pagamento{
    private int codigoDigital;

    public CarteiraDigital(int senha, String nomeUser, double saldo, int codigoDigital) {
        super(senha, nomeUser, saldo);
        this.codigoDigital = codigoDigital;
    }

    @Override
    public void validacaoAntiFraude(int numero) {
        if (numero == codigoDigital){
            System.out.println("Código verificado com sucesso!");
        }else {
            System.out.println("Código digital inválido!");
        }
    }

    @Override
    public void registroDeTransacao() {
        System.out.println("Transação digital: "+codigoDigital+" realizado por: "+nomeUser);
    }
}

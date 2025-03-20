package com.senai.aula06_abstracao.Exercicios.exercicio1;

public interface CheckIn {
    double PESO_MAXIMO_BAGAGEM_MAO = 10;
    double PESO_MAXIMO_BAGAGEM = 23;
    int QTD_MAXIMA_BAGAGEM_POR_PESSOA = 4;

    boolean validarDocumentos();
    void emitirCartaoEmbarque(boolean verificarBagagens);

    static void mensagemPadrao(){
        System.out.println("Check-in seguro realizado pela FlySecure.");
    }
    static boolean verificarBagagens(int qtdBagagens, int qtdPessoas, double pesoBagagemMao, double pesoBagagem){
        int bagagensPorPessoa = qtdBagagens / qtdPessoas;

        if (bagagensPorPessoa < QTD_MAXIMA_BAGAGEM_POR_PESSOA && pesoBagagem <= PESO_MAXIMO_BAGAGEM && pesoBagagemMao <= PESO_MAXIMO_BAGAGEM_MAO ){
            return true;
        }else {
            return false;
        }
    }
}

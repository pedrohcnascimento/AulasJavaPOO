package com.senai.aula06_abstracao.Exercicios.exercicio3;

public class Main {
    public static void main(String[] args) {
        testarPagamentos(new CartaoCredito(1243,"Pedro",100000,1234));
        testarPagamentos(new PIX(1234,"Pedro",10000,1234));
        testarPagamentos(new CarteiraDigital(1234,"Pedro",10000,1234));
    }
    private static void testarPagamentos(Pagamento pagamento){
        System.out.println("--------------Testando pagamentos-------------------");
        pagamento.autenticacaoUsuario("Pedro",1234);
        pagamento.registrologs("Pedro","10/10/2010 18:00:00");
        pagamento.registroDeTransacao();
        pagamento.validacaoAntiFraude(1234);
        pagamento.validacaoSeguranca(1234);
    }
}

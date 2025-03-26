package com.senai.aula06_abstracao.Exercicios.exercicio4;

public interface Evento {
    int MAX_VALOR_PREMIACAO = 100000;
    double MAX_TEMPO_EVENTO_HORAS = 168;


    default void inicio(int valorPremio, double duracaoEvento){
        if (verificarIntegridade(valorPremio,duracaoEvento)){
            System.out.println("Evento iniciado, tempo restante para termino de evento:"+duracaoEvento+"\nPrimeiro lugar do evento receberá: "+valorPremio);
        } else{
            System.out.println("Valor de prêmio ou duração de evento inválidos!");
        }
    }
    default void encerramento(double duracaoEvento, double tempoEventoPercorrido,int valorPremio ){
        if (verificarIntegridade(valorPremio , duracaoEvento)){
            if (duracaoEvento < tempoEventoPercorrido){
                System.out.println("Evento encerrado!");
            } else {
                System.out.println("Evento ainda possui: "+(duracaoEvento-tempoEventoPercorrido)+" horas até ser encerrado!");
            }
        } else {
            System.out.println("Valores inseridos inválidos!");
        }

    }
    default void premiacao(String nomePlayer, int valorPremio){
        if (verificarIntegridade(valorPremio, 0)){
            System.out.println("O jogador: "+ nomePlayer+" ficou em primeiro lugar, e receberá o prêmio máximo de: "+valorPremio+" vbucks!");
        } else {
            System.out.println("Valor da premiação inválido");
        }
    }

    private static boolean verificarIntegridade(int valorPremio, double duracaoEvento){
        return (valorPremio >= 0) && (valorPremio <= MAX_VALOR_PREMIACAO) && (duracaoEvento >= 0) && (duracaoEvento <= MAX_TEMPO_EVENTO_HORAS);
    }
}

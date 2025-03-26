package com.senai.aula06_abstracao.Exercicios.exercicio4;

public class Main {
    public static void main(String[] args) {
      testarEventos(new EventoSocial(120,1000));
      testarEventos(new Competicao(168,8000));
      testarEventos(new DesafioRelampago(24,10000,3));
    }
    private static void testarEventos(Evento evento){
        System.out.println("----------------Teste de eventos-----------------");
        if (evento instanceof EventoSocial eventoSocial){
            eventoSocial.inicio(eventoSocial.getValorPremio(),eventoSocial.getDuracaoEvento());
            eventoSocial.encerramento(eventoSocial.getDuracaoEvento(),100, eventoSocial.getValorPremio());
            eventoSocial.premiacao("Pafuncio",eventoSocial.getValorPremio());
        } else if (evento instanceof  Competicao competicao){
            competicao.inicio(competicao.getValorPremio(),competicao.getDuracaoEvento());
            competicao.encerramento(competicao.getDuracaoEvento(),100, competicao.getValorPremio());
            competicao.premiacao("Pafuncio",competicao.getValorPremio());
        } else if (evento instanceof  DesafioRelampago desafioRelampago){
            desafioRelampago.inicio(desafioRelampago.getValorPremio(),desafioRelampago.getDuracaoEvento());
            desafioRelampago.encerramento(desafioRelampago.getDuracaoEvento(),100, desafioRelampago.getValorPremio());
            desafioRelampago.premiacao("Pafuncio",desafioRelampago.getValorPremio());
        }
    }
}

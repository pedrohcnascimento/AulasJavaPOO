package com.senai.aula04_herancas.exercicios.exercicio3;

public class PedidoOnline extends Pedido{
    private double taxaDeEntraga;

    public PedidoOnline(long numeroPedido, double valortotal, double taxaDeEntraga) {
        super(numeroPedido, valortotal);
        this.taxaDeEntraga = taxaDeEntraga;
    }

    public double getTaxaDeEntraga() {
        return taxaDeEntraga;
    }

    public void setTaxaDeEntraga(double taxaDeEntraga) {
        this.taxaDeEntraga = taxaDeEntraga;
    }
}

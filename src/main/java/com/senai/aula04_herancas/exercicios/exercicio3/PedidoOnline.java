package com.senai.aula04_herancas.exercicios.exercicio3;

public class PedidoOnline extends Pedido{
    private double taxaDeEntrega;

    public PedidoOnline(long numeroPedido, double valortotal, double taxaDeEntrega) {
        super(numeroPedido, valortotal);
        this.taxaDeEntrega = taxaDeEntrega;
    }

    @Override
    public double getAtributo() {
        return taxaDeEntrega;
    }

    @Override
    public void setAtributo(double atributo) {
        this.taxaDeEntrega = atributo;
    }

    @Override
    public String toString() {
        return super.toString()
                +"Taxa de entrega: "+ taxaDeEntrega;
    }
}

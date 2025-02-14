package com.senai.aula04_herancas.exercicios.exercicio3;

public class PedidoPresencial extends Pedido{
    private double descontoAVista;

    public PedidoPresencial(long numeroPedido, double valortotal, double descontoAVista) {
        super(numeroPedido, valortotal);
        this.descontoAVista = descontoAVista;
    }

    public double getDescontoAVista() {
        return descontoAVista;
    }

    public void setDescontoAVista(double descontoAVista) {
        this.descontoAVista = descontoAVista;
    }
}

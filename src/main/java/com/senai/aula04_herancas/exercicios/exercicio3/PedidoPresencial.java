package com.senai.aula04_herancas.exercicios.exercicio3;

public class PedidoPresencial extends Pedido{
    private double descontoAVista;

    public PedidoPresencial(long numeroPedido, double valortotal, double descontoAVista) {
        super(numeroPedido, valortotal);
        this.descontoAVista = descontoAVista;
    }

    @Override
    public double getAtributo() {
        return descontoAVista;
    }

    @Override
    public void setAtributo(double atributo) {
        this.descontoAVista = atributo;
    }

    @Override
    public String toString() {
        return super.toString()
                +"Desconto a vista: "+ descontoAVista;
    }
}

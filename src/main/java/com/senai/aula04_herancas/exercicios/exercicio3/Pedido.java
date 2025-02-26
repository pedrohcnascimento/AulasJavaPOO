package com.senai.aula04_herancas.exercicios.exercicio3;

public class Pedido {
    private long numeroPedido;
    private double valortotal;
    private double atributo;

    public Pedido(long numeroPedido, double valortotal) {
        this.numeroPedido = numeroPedido;
        this.valortotal = valortotal;
    }

    public double getAtributo() {
        return atributo;
    }

    public void setAtributo(double atributo) {
        this.atributo = atributo;
    }

    public long getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(long numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public double getValortotal() {
        return valortotal;
    }

    public void setValortotal(double valortotal) {
        this.valortotal = valortotal;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido=" + numeroPedido +
                ", valortotal=" + valortotal;
    }
}

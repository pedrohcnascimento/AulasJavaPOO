package com.senai.aula05_polimorfismo.exemplos.pagamentos;

public class CLT extends Pagamento{
    private double salario;

    public CLT(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }

    @Override
    public double calcularPagamento() {
        return salario;
    }
}

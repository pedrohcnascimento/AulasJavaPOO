package com.senai.aula05_polimorfismo.exemplos.pagamentos;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pagamento> listaPagamentos = new ArrayList<>();

        listaPagamentos.add(new CLT("Rafael",1000));
        listaPagamentos.add(new PJ("Pedro",200,50));
        listaPagamentos.add(new Freelancer("Joana",100000));

        listaPagamentos.forEach(p -> System.out.println(p.calcularPagamento()));
    }
}

package com.senai.aula06_abstracao.Exercicios.exercicio3;

public abstract class Pagamento {
    protected int senha;
    protected String nomeUser;
    protected double saldo;

    public Pagamento(int senha, String nomeUser, double saldo) {
        this.senha = senha;
        this.nomeUser = nomeUser;
        this.saldo = saldo;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getNomeUser() {
        return nomeUser;
    }

    public void setNomeUser(String nomeUser) {
        this.nomeUser = nomeUser;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    abstract void validacaoAntiFraude(int numero);
    abstract void registroDeTransacao();

    public void registrologs(String nomeUser, String dataEHora){
        System.out.println("O usuário: "+nomeUser+" realizou uma ação às: "+dataEHora);
    }

    public void validacaoSeguranca(double valor){
        if (valor > saldo){
            System.out.println("Valor da conta baixo demais para isto");
        }
    }
    void autenticacaoUsuario(String userNome, int senha){
        if (nomeUser.equals(userNome) && this.senha == senha){
            System.out.println("Validação de usuário bem sucedido!");
        } else {
            System.out.println("Validação de usuário mal sucedida!");
        }
    }
}

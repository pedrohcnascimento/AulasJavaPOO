package com.senai.aula06_abstracao.Exercicios.exercicio1;

public class Azul implements CheckIn{
    private String dataDaViagem;
    private String dataNaPassagem;
    private String CPF;
    private String CPFdoDocumento;

    public Azul(String dataDaViagem, String dataNaPassagem, String CPF, String CPFdoDocumento) {
        this.dataDaViagem = dataDaViagem;
        this.dataNaPassagem = dataNaPassagem;
        this.CPF = CPF;
        this.CPFdoDocumento = CPFdoDocumento;
    }

    @Override
    public boolean validarDocumentos() {
        if (dataDaViagem.equals(dataNaPassagem) && CPF.equals(CPFdoDocumento)){
            System.out.println("Documentos válidos!");
            return true;
        }else {
            System.out.println("Documentos inválidos");
            return false;
        }
    }

    @Override
    public void emitirCartaoEmbarque(boolean verificarBagagens) {
        if (validarDocumentos() && verificarBagagens){
            System.out.println("Catão de embarque emitido com sucesso pela empresa Azul!");
        } else {
            System.out.println("Cartão de embarque recusado!");
        }
    }
}

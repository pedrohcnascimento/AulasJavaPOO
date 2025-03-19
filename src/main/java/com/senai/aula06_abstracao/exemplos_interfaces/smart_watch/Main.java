package com.senai.aula06_abstracao.exemplos_interfaces.smart_watch;

public class Main {
    public static void main(String[] args) {
        SmartWatchAvancado smartWatch = new SmartWatchAvancado();

        smartWatch.ExibirInfoDispositivo();
        smartWatch.contarPassos();
        smartWatch.medirFrequenciaCardiaca();
        smartWatch.medirQualidadeSono();
    }
}

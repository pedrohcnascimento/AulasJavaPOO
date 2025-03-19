package com.senai.aula06_abstracao.exemplos_interfaces.smart_watch;

public class SmartWatchAvancado implements SensorCardiaco, SensorPassos, SensorSono{

    @Override
    public void medirFrequenciaCardiaca() {
        System.out.println("Medição cardíaca: 80bpm.");
    }

    @Override
    public void contarPassos() {
        System.out.println("Passos hoje: 450 passos.");
    }

    @Override
    public void medirQualidadeSono() {
        System.out.println("Qualidade do sono: 7:30h de sono profundo.");
    }

    void ExibirInfoDispositivo(){
        System.out.println("SmartWatch avançado conectado com múltiplos sensores.");
    }
}

package com.senai.aula05_polimorfismo.exercicios.exercicio4;

public class Sensor {
    private long id;
    private boolean status;

    public Sensor(long id, boolean status) {
        this.id = id;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Sensor{" +
                "id=" + id +
                ", status=" + status +
                '}';
    }
}

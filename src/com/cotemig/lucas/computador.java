package com.cotemig.lucas;

public class computador {
    private String tamanho;
    private double ram;
    private String SO;

    public computador(String tamanho, double ram, String so) {
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getRam() {
        return ram;
    }

    public void setRam(double ram) {
        this.ram = ram;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }
    public void Caracteristicas(){
        
        System.out.println("Características: ");
    }
}

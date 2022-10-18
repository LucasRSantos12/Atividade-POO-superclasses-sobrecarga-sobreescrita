package com.cotemig.lucas;

public class notebook extends computador{
    public notebook(String tamanho, double marca, String SO) {
        super(tamanho, marca, SO);
    }
    @Override
    public void Caracteristicas() {
        super.Caracteristicas();
    }
    public void Caracteristicas(double tamanho) {
        super.Caracteristicas();
        System.out.println("Tamanho: " + tamanho);
    }
    public void Caracteristicas(double tamanho, String cor) {
        super.Caracteristicas();
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
    }
    public void Caracteristicas(String cor) {
        super.Caracteristicas();
        System.out.println("Cor: " + cor);
    }
}

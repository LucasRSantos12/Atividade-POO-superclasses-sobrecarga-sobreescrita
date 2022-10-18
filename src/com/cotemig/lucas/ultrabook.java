package com.cotemig.lucas;

public class ultrabook extends  computador{
    public ultrabook(String tamanho, double ram, String SO) {
        super(tamanho, ram, SO);
    }

    @Override
    public void Caracteristicas() {

        super.Caracteristicas();
    }
    public void Caracteristicas(double tamanho) {
        super.Caracteristicas();
        System.out.println("Tamanho da tela: " + tamanho);
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

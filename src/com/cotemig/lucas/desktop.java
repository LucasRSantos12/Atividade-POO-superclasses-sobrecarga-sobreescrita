package com.cotemig.lucas;

public class desktop extends  computador{
    public desktop(String tamanho, double ram, String SO) {
        super(tamanho, ram, SO);
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
    public void informaCaracteristicas(String cor) {
        super.Caracteristicas();
        System.out.println("Cor: " + cor);
    }
}

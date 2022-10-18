package com.cotemig.lucas;

public class carro extends veiculomarcha{
    @Override
    public void aumentarVelocidade(double velocidade, int marcha) {
        if (velocidade > this.velocidade && marcha > this.marcha) {
            if (velocidade <= 200 && marcha <= 5) {
                this.velocidade = velocidade;
            }
        }
    }
}

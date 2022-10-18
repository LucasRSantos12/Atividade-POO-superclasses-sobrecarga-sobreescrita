package com.cotemig.lucas;

public class moto extends veiculomarcha{
    @Override
    public void aumentarVelocidade(double velocidade, int marcha) {
        if (velocidade > this.velocidade && marcha > this.marcha) {
            if (velocidade <= 100 && marcha <= 4) {
                this.velocidade = velocidade;
            }
        }
    }
}

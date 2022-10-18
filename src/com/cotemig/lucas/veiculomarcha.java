package com.cotemig.lucas;

public class veiculomarcha extends veiculo{
    protected int marcha;

    // SOBRECARGA
    public void aumentarVelocidade(double velocidade, int marcha) {
        super.aumentarVelocidade(velocidade);
    }

    // SOBRECARGA
    public void diminuirVelocidade(double velocidade, int marcha) {
        if (velocidade < this.velocidade && marcha < this.marcha) {
            if (velocidade >= 0 && marcha >= 1) {
                this.velocidade = velocidade;
            }
        }
    }
}

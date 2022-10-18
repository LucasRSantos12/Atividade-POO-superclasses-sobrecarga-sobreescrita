package com.cotemig.lucas;

public class veiculo {
    protected double velocidade;

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void aumentarVelocidade(double velocidade) {
        if (velocidade > this.velocidade) {
            this.velocidade = velocidade;
        }
    }

    public void diminuirVelocidade(double velocidade) {
        if (velocidade < this.velocidade) {
            this.velocidade = velocidade;
        }
    }
}

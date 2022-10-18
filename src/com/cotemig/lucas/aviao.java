package com.cotemig.lucas;

public class aviao extends  veiculo{
    private double altitude;
    private int resistenciaAr;

    // SOBRECARGA
    public void aumentarVelocidade(double velocidade, double altitude, int resistenciaAr) {
        if (velocidade > this.velocidade &&
                altitude > this.altitude &&
                resistenciaAr < this.resistenciaAr ) {
            if (velocidade <= 1000 && altitude <= 3000 && resistenciaAr < 50) {
                this.velocidade = velocidade;
            }
        }
    }

    // SOBRECARGA
    public void diminuirVelocidade(double velocidade, double altitude, int resistenciaAr) {
        if (velocidade < this.velocidade &&
                altitude < this.altitude &&
                resistenciaAr > this.resistenciaAr) {
            if (velocidade >= 100 && altitude >= 1000 && resistenciaAr > 100) {
                this.velocidade = velocidade;
            }
        }
    }
}

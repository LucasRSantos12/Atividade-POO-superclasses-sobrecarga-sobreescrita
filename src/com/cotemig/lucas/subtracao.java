package com.cotemig.lucas;

public class subtracao extends Calculadora{
    public subtracao(String cor, String marca) {

        super(cor,marca);
    }

    @Override
    public void calcular(double valor1, double valor2) {
        super.calcular(valor1, valor2);

        System.out.println(valor1-valor2);
    }
    public void calcular(int valor1, int valor2) {
        super.calcular(valor1, valor2);

        System.out.println(valor1-valor2);
    }
}

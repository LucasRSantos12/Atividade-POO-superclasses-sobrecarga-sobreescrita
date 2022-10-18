package com.cotemig.lucas;

public class alcool extends substancia{
    public alcool(String nome, String atomo, String componente, double graus) {
        super(nome, atomo, componente, graus);
    }

    @Override
    public String PontoDeEbulicao(double graus) {
        if(graus == 78.4) {
            return super.PontoDeEbulicao(graus);
        }
        else {
            return "Ainda não entrou";
        }
    }

    @Override
    public String PontoDeFusao(double graus) {

        if(graus == 0) {
            return super.PontoDeFusao(graus);
        }
        else {
            return "Ainda não entrou";
        }
    }
}

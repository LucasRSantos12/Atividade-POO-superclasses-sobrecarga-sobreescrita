package com.cotemig.lucas;

public class agua extends substancia{
    private String cor;

    public agua(String nome, String atomo, String componente, String cor, double graus) {
        super(nome, atomo, componente, graus);
        this.cor = cor;
    }

    public String getCor() {

        return cor;
    }

    public void setCor(String cor) {

        this.cor = cor;
    }


    @Override
    public String PontoDeEbulicao(double graus) {
        if(graus == 100) {
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

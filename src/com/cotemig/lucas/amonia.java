package com.cotemig.lucas;

public class amonia extends substancia{
    public amonia(String nome, String atomo, String tipo_componente, double graus) {
        super(nome, atomo, tipo_componente, graus);
    }
    @Override
    public String PontoDeEbulicao(double graus) {
        if(graus == -33.34) {
            return super.PontoDeEbulicao(graus);
        }
        else {
            return "Ainda não entrou";
        }
    }

    @Override
    public String PontoDeFusao(double graus) {

        if(graus == -77.73) {
            return super.PontoDeFusao(graus);
        }
        else {
            return "Ainda não entrou";
        }
    }
}

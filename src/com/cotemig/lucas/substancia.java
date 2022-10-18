package com.cotemig.lucas;

public class substancia {
        private String nome;
        private String atomo;
        private String componente;
        private double Graus;

        public substancia(String nome, String atomo, String componente, double Graus) {
            this.nome = nome;
            this.atomo = atomo;
            this.componente = componente;
            this.Graus = Graus;
        }

        public String getNome() {

            return nome;
        }

        public void setNome(String nome) {

            this.nome = nome;
        }

        public String getAtomo() {

            return atomo;
        }

        public void setAtomo(String atomo) {

            this.atomo = atomo;
        }

        public String getcomponente() {

            return componente;
        }

        public void setcomponente(String tipo_componente) {

            componente = tipo_componente;
        }

        public double getGraus() {

            return Graus;
        }

        public void setGraus(double graus) {

            this.Graus = graus;
        }

        public String PontoDeEbulicao(double graus){

            return "ponto de ebulição";
        }
        public String PontoDeFusao(double graus){

            return "ponto de Fusao";
        }
}

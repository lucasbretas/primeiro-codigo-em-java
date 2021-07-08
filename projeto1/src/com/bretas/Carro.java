package com.bretas;
public class Carro{
    private int quantidadeDeAssentos;
    public String getAssentos(){
        return "o carro tem "+quantidadeDeAssentos+" assentos disponíveis";
    }
    public void setAssentos(int assentos){
        this.quantidadeDeAssentos=assentos;
    }
    public String adicionaPessoa(){
        return "uma pessoa entrou no carro";
    }
    public String removePessoa(){
        return "uma pessoa saiu do carro";
    }

}
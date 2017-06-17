package com.example.mobile.appmobiprice;

/**
 * Created by Danilo on 21/05/2017.
 */

public class Produtos {

    private String nome;
    private Double valor;

    public Produtos(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

}

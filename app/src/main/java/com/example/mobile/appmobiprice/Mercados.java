package com.example.mobile.appmobiprice;

/**
 * Created by Danilo on 16/06/2017.
 */

public class Mercados {

    private String nome;
    private String endereco;

    public Mercados(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

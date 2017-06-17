package com.example.mobile.appmobiprice;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Danilo on 21/05/2017.
 */

public class RepositorioBanco {

    private SQLiteDatabase conexao;

    private RepositorioBanco(SQLiteDatabase conexao) {
    this.conexao =conexao;
}

    public void inserirProdutos(Produtos produto){
        ContentValues values = new ContentValues();

        values.put("NOME", produto.getNome());
        values.put("PRECO", produto.getValor());

        conexao.insertOrThrow("MERCADO", null, values);
    }

    public void inserirMercados(Mercados mercados){
        ContentValues values = new ContentValues();

        values.put("NOME", mercados.getNome());
        values.put("ENDERECO", mercados.getEndereco());

        conexao.insertOrThrow("MERCADO", null, values);
    }
}

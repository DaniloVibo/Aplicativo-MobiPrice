package com.example.mobile.appmobiprice;

/**
 * Created by Danilo on 21/05/2017.
 */

public class ScriptDataBase {

        public static String supermercado(){
            StringBuilder sqlBuilder = new StringBuilder();
            sqlBuilder.append("CREATE TABLE SUPERMERCADO (");
            sqlBuilder.append("ID INTEGER NOT NULL AUTO INCREMENT PRIMARY KEY, ");
            sqlBuilder.append("NOME VARCHAR(50) NOT NULL,");
            sqlBuilder.append("ENDERECO VARCHAR(256) NOT NULL,");
            sqlBuilder.append(");");

            return sqlBuilder.toString();
        }

    public static String produto(){
        StringBuilder sqlBuilder = new StringBuilder();
        sqlBuilder.append("CREATE TABLE PRODUTO (");
        sqlBuilder.append("ID_PRODUTO INTEGER NOT NULL AUTO INCREMENT PRIMARY KEY, ");
        sqlBuilder.append("NOME VARCHAR(50) NOT NULL,");
        sqlBuilder.append("PRECO DECIMAL(5,2) NOT NULL,");
        sqlBuilder.append("ID_MERCADO INTEGER NOT NULL,");
        sqlBuilder.append("FOREIGN KEY ID_MERCADO REFERENCES SUPERMERCADO(ID)");
        sqlBuilder.append(");");

        return sqlBuilder.toString();
    }
}

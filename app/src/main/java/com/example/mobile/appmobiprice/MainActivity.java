package com.example.mobile.appmobiprice;

import android.content.Intent;
import android.database.SQLException;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import android.database.sqlite.*;
import android.database.*;

public class MainActivity extends AppCompatActivity {

    private DataBase database;
    private SQLiteDatabase conexao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        FloatingActionButton botao = (FloatingActionButton) findViewById(R.id.botao);
        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Lista de compras realizada!", Snackbar.LENGTH_SHORT);
                Intent intent = new Intent(MainActivity.this, FinalActivity.class);
                startActivity(intent);
            }

        });

        try {
            database = new DataBase(this);
            conexao = database.getReadableDatabase();

            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setMessage("Selecione os itens da sua compra");
            alert.setNeutralButton("OK", null);
            alert.show();
        }catch (SQLException exception){
            AlertDialog.Builder alert = new AlertDialog.Builder(this);
            alert.setMessage("Problema de conexão");
            alert.setNeutralButton("OK", null);
            alert.show();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}

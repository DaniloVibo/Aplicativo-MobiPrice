package com.example.mobile.appmobiprice;

/**
 * Created by Danilo on 21/05/2017.
 */

import android.content.Context;
import android.database.sqlite.*;

public class DataBase extends SQLiteOpenHelper{

    public DataBase(Context context){
    super(context, "MERCADO", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScriptDataBase.supermercado());
        db.execSQL(ScriptDataBase.produto());

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        switch (oldVersion){
            case 1 :  db.execSQL("ALTER");
                db.execSQL("ALTER");
            case 2 :  db.execSQL("ALTER");
        }
    }
}

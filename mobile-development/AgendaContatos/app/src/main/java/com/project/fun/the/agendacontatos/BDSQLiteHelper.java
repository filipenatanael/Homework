package com.project.fun.the.agendacontatos;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by suporte on 02/05/2018.
 */

public class BDSQLiteHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String  DATABASE_NAME = "ContatoDB";

    public BDSQLiteHelper(Context context) {
        super(context, DATABASE_NAME,  null,  DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE contatos(" +
                "id INTEGER PRIMARY KEY  AUTOINCREMENT," +
                "nome TEXT," +
                "telefone TEXT,";

        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
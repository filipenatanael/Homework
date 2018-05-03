package com.project.fun.the.agendacontatos;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by suporte on 02/05/2018.
 */

public class BDSQLiteHelper extends SQLiteOpenHelper{

    private static final int DATABASE_VERSION = 1;
    private static final String  DATABASE_NAME = "ContatoDB";

    private static final String TABELA_CONTATOS = "contatos";
    private static final String ID = "id";
    private static final String NOME = "nome";
    private static final String TELEFONE = "telefone";
    private static final String[] COLUNAS = { ID, NOME, TELEFONE };

    public BDSQLiteHelper(Context context) {
        super(context, DATABASE_NAME,  null,  DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE = "CREATE TABLE contatos(" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "nome TEXT," +
                "telefone TEXT";

        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       db.execSQL("DROP TABLE IF EXISTS contatos");
        this.onCreate(db);
    }

    public void addContato(Contato contato) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(NOME, contato.getNome());
        values.put(TELEFONE, contato.getTelefone());
        db.insert(TABELA_CONTATOS, null, values);
        db.close();
    }


    public Contato getContato(int id) {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABELA_CONTATOS,
                COLUNAS,
                " id = ?",
                new String[] { String.valueOf(id) },
                null,
                null,
                null,
                null);
        if (cursor == null) {
            return null;
        } else {
            cursor.moveToFirst();
            Contato contato = cursorToContato(cursor);
            return contato;
        }
    }

    private Contato cursorToContato(Cursor cursor) {
        Contato contato = new Contato();
        contato.setId(Integer.parseInt(cursor.getString(0)));
        contato.setNome(cursor.getString(1));
        contato.setTelefone(cursor.getString(2));
        return contato;
    }


}
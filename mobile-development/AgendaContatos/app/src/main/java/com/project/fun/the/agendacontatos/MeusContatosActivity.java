package com.project.fun.the.agendacontatos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MeusContatosActivity extends Activity {

    private BDSQLiteHelper database;
    ArrayList<Contato> listaContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_contatos);





    }
}

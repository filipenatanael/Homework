package com.project.fun.the.agendacontatos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MeusContatosActivity extends Activity {

    private BDSQLiteHelper database;
    ArrayList<Contato> listaContatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_contatos);

        database = new BDSQLiteHelper(this);
        

    }

    @Override
    protected void onStart() {
        super.onStart();
        ListView lista = (ListView) findViewById(R.id.listViewContatos);
        listaContatos = database.getAllContatos();
        ContatoAdapter adapter = new ContatoAdapter(this, listaContatos);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Intent intent = new Intent(MeusContatosActivity.this, MeusContatosActivity.class);
                intent.putExtra("ID", listaContatos.get(position).getId());
                startActivity(intent);
            }
        });
    }

}

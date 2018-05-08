package com.project.fun.the.agendacontatos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MeusContatosActivity extends Activity {

    private BDSQLiteHelper database;
    ArrayList<Contato> listaContatos;
    private SearchView searchViewContato;
    private Button buttonSearch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meus_contatos);
        database = new BDSQLiteHelper(this);

        searchViewContato = (SearchView) findViewById(R.id.searchViewContato);
        buttonSearch = (Button) findViewById(R.id.buttonSearch);

        buttonSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(searchViewContato.getQuery().toString().isEmpty()) {
                    ListView lista = (ListView) findViewById(R.id.listViewContatos);
                    listaContatos = database.getAllContatos();
                    ContatoAdapter adapter = new ContatoAdapter(MeusContatosActivity.this, listaContatos);
                    lista.setAdapter(adapter);

                    lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view,
                                                int position, long id) {
                            //Toast.makeText(MeusContatosActivity.this, listaContatos.get(position).getNome(), Toast.LENGTH_SHORT).show();
                            String telefone = listaContatos.get(position).getTelefone().toString();
                            Uri uri = Uri.parse("tel:"+telefone);
                            Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                            startActivity(intent);
                        }
                    });
                } else {
                    ListView lista = (ListView) findViewById(R.id.listViewContatos);
                    listaContatos = database.getSearchContatos(searchViewContato.getQuery().toString());
                    ContatoAdapter adapter = new ContatoAdapter(MeusContatosActivity.this, listaContatos);
                    lista.setAdapter(adapter);

                    lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                        @Override
                        public void onItemClick(AdapterView<?> parent, View view,
                                                int position, long id) {
                            //Toast.makeText(MeusContatosActivity.this, listaContatos.get(position).getNome(), Toast.LENGTH_SHORT).show();
                            String telefone = listaContatos.get(position).getTelefone().toString();
                            Uri uri = Uri.parse("tel:"+telefone);
                            Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                            startActivity(intent);
                        }
                    });

                }

            }
        });

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
                //Toast.makeText(MeusContatosActivity.this, listaContatos.get(position).getNome(), Toast.LENGTH_SHORT).show();
                String telefone = listaContatos.get(position).getTelefone().toString();
                Uri uri = Uri.parse("tel:"+telefone);
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
                startActivity(intent);
            }
        });
    }

}

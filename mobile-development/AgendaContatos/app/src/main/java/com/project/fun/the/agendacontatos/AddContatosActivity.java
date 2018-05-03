package com.project.fun.the.agendacontatos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddContatosActivity extends Activity {

    private BDSQLiteHelper db;
    private Button btnAdicionar;
    private EditText nome;
    private EditText telefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_contatos);

        db = new BDSQLiteHelper(this);

        nome = (EditText) findViewById(R.id.editTextNome);
        telefone = (EditText) findViewById(R.id.editTextTelefone);

        btnAdicionar = (Button) findViewById(R.id.btnAdicionar);


        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Contato contato = new Contato();
                contato.setNome(nome.getText().toString());
                contato.setTelefone(telefone.getText().toString());

                db.addContato(contato);

                Toast.makeText(getBaseContext(), nome.getText().toString()+" Foi adicionado!", Toast.LENGTH_SHORT).show();

            }
        });

    }
}

package com.project.fun.the.agendacontatos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toolbar;

import java.util.ArrayList;

public class MainActivity extends Activity {

    private Button btnNovoContato;
    private Button btnMeusContatos;
    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNovoContato = (Button) findViewById(R.id.btnNovoContato);
        btnMeusContatos = (Button) findViewById(R.id.btnMeusContatos);
        imageView = (ImageView) findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.logo);

        btnNovoContato.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AddContatosActivity.class);
                startActivity(intent);
            }
        });

        btnMeusContatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MeusContatosActivity.class);
                startActivity(intent);
            }
        });

    }

}

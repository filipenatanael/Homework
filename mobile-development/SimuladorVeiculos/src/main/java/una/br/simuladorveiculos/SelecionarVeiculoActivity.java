package una.br.simuladorveiculos;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class SelecionarVeiculoActivity extends Activity {

    private TextView txtBemVindo;
    private Spinner spVeiculo;
    private ImageView imgVeiculo;
    private TextView txtValor;
    private Button btnVisitar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecionar_veiculo);

        txtBemVindo = (TextView)findViewById(R.id.txtBemVindo);
        spVeiculo = (Spinner)findViewById(R.id.spVeiculo);
        imgVeiculo = (ImageView) findViewById(R.id.imgVeiculo);
        txtValor = (TextView)findViewById(R.id.txtValor);
        btnVisitar = (Button)findViewById(R.id.btnVisitar);

        final Intent intent = getIntent();
        String nome = intent.getExtras().getString("nome");
        txtBemVindo.setText("Seja bem-vindo "+ nome + "!");

        ArrayAdapter<CharSequence>veiculos = ArrayAdapter.createFromResource(SelecionarVeiculoActivity.this,
                R.array.veiculos, android.R.layout.simple_spinner_item);

        veiculos.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spVeiculo.setAdapter(veiculos);

        spVeiculo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        imgVeiculo.setImageResource(R.drawable.toro);
                        txtValor.setText("R$ 85.860,00");
                        break;
                    case 1:
                        imgVeiculo.setImageResource(R.drawable.uno);
                        txtValor.setText("R$ 43.320,00");
                        break;
                    case 2:
                        imgVeiculo.setImageResource(R.drawable.palio);
                        txtValor.setText("R$ 44.570,00");
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        btnVisitar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
              String url = "";

                switch (spVeiculo.getSelectedItemPosition()){
                    case 0: url = "http://www.fiat.com.br/carros/toro;html"; break;
                    case 1: url = "http://www.fiat.com.br/carros/uno;html"; break;
                    case 2: url = "http://www.fiat.com.br/carros/palio;html"; break;
                }

                Uri uri = Uri.parse(url);
                Intent intent1 = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

    }
}

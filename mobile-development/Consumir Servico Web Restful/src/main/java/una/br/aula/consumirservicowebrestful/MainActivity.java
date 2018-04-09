package una.br.aula.consumirservicowebrestful;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import una.br.aula.consumirservicowebrestful.service.ProdutoService;

public class MainActivity extends Activity {

    private Button btnPesquisar;
    private EditText editCodigo;
    private TextView txtCodigo;
    private TextView txtNome;
    private TextView txtQuantidade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPesquisar = (Button) findViewById(R.id.btnPesquisar);
        editCodigo = (EditText) findViewById(R.id.editCodigo);
        txtCodigo = (TextView) findViewById(R.id.txtCodigo);
        txtNome = (TextView) findViewById(R.id.txtNome);
        txtQuantidade = (TextView) findViewById(R.id.txtQuantidade);


        btnPesquisar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String codigoPesquisa = editCodigo.getText().toString();

                if(codigoPesquisa.isEmpty() == false) {
                    ProdutoService servico = new ProdutoService(txtCodigo, txtNome, txtQuantidade);
                    servico.execute(codigoPesquisa);
                }
            }
        });

    }
}

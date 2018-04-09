package una.br.aula.orcamentos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText editPrimeiro;
    private EditText editSegundo;
    private Button btnResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editPrimeiro = (EditText)findViewById(R.id.editPrimeiro);
        editSegundo = (EditText)findViewById(R.id.editSegundo);
        btnResultado = (Button)findViewById(R.id.btnResultado);

        btnResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float primeiroVal;
                float segundoVal;
                float resultado;
                String teste;

                primeiroVal = Float.parseFloat(editPrimeiro.getText().toString());
                segundoVal = Float.parseFloat(editSegundo.getText().toString());

                if(primeiroVal < 0 || segundoVal < 0) {
                    Toast.makeText(MainActivity.this, "O valor de ser [>= 0]!", Toast.LENGTH_SHORT).show();
                }

                resultado = primeiroVal + segundoVal;

                Intent intent = new Intent(MainActivity.this, ResultadoActivity.class);
                intent.putExtra("resultado",Float.toString(resultado));
                startActivity(intent);
            }
        });


    }
}

package una.br.aula.orcamentos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultadoActivity extends Activity {

    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        txtResultado = (TextView)findViewById(R.id.txtResultado);

        final Intent intent = getIntent();
        String resultado = intent.getExtras().getString("resultado");
        txtResultado.setText("> "+resultado);

    }
}

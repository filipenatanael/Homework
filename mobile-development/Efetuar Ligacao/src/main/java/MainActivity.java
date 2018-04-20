package una.br.aula.efetuarligacao;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {

    private Button btnChamar;
    private EditText editTextTelefone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnChamar = (Button)findViewById(R.id.btnChamar);

        btnChamar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                editTextTelefone = (EditText)findViewById(R.id.editTextTelefone);
                String telefone = editTextTelefone.getText().toString();

                Uri uri = Uri.parse("tel:"+telefone);
                Intent intent = new Intent(Intent.ACTION_DIAL, uri);

                startActivity(intent);
            }
        });


    }
}

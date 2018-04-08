package una.br.simuladorveiculos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {

    private EditText editNome;
    private EditText editEmail;
    private Button btnEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editNome = (EditText)findViewById(R.id.editNome);
        editEmail = (EditText)findViewById(R.id.editEmail);
        btnEntrar = (Button)findViewById(R.id.btnEntrar);

        btnEntrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String nome;
                String email;

                nome = editNome.getText().toString();
                email = editEmail.getText().toString();

                if(nome.isEmpty()){
                    Toast.makeText(LoginActivity.this, "Nome não informado!", Toast.LENGTH_SHORT).show();
                }

                if(email.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "E-mail não informado!", Toast.LENGTH_SHORT).show();
                }


                Intent intent = new Intent(LoginActivity.this, SelecionarVeiculoActivity.class);
                intent.putExtra("nome", nome);
                intent.putExtra("email", email);
                startActivity(intent);

            }
        });
    }
}

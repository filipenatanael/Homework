package una.br.aula.consumirservicowebrestful.service;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;

import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import una.br.aula.consumirservicowebrestful.model.Produto;

import static android.R.attr.tag;

/**
 * Created by suporte on 08/04/2018.
 */

public class ProdutoService extends AsyncTask<String, Void, Produto> {

    private TextView codigo = null;
    private TextView nome = null;
    private TextView quantidade = null;

    public ProdutoService(TextView codigo, TextView nome, TextView quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }

    @Override
    protected Produto doInBackground(String... codigo) {
        try {
            final String url = "http://caspinheiro.com.br/ddm/public/api/produto/" + codigo[0];
            RestTemplate restTemplate = new RestTemplate();
            restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
            Produto produto = restTemplate.getForObject(url, Produto.class);
            return produto;
        } catch (Exception e)  {
            Log.e("MainActivity", e.getMessage(), e);
        }
        return null;
    }

    @Override
    protected void onPostExecute(Produto produto) {
        super.onPostExecute(produto);
        if(produto != null) {
            codigo.setText(Integer.toString(produto.getCodigo()));
            nome.setText(produto.getNome());
            quantidade.setText(Integer.toString(produto.getQuantidade()));
        }
    }

}

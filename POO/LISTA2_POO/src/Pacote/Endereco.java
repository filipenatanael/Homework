package Pacote;

/*
1) Implemente uma classe Endereço contendo os atributos logradouro, bairro, cidade
   Sobrescreva o método ToString de forma a exibir o valor de todos os atributos da classe.  
*/
public class Endereco {
	private String logradouro;
	private String bairro;
	private String cidade;
	
	
	@Override
	public String toString() {
		return "Endereco [logradouro=" + logradouro + ", bairro=" + bairro + ", cidade=" + cidade + "]";
	}

	
	public String getLogradouro() {
		return logradouro;
	}


	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	

	

}

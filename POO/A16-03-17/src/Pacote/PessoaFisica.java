package Pacote;

public class PessoaFisica extends Pessoa{
	private int idade;
	public PessoaFisica(String nome) {
		super(nome);
	
	}
	
	public String getPrimeiroNome(){
		int auxiliar = this.getNome().indexOf(' ');
		return this.getNome().substring(0,auxiliar);
	}
	
	public void setIdade(int idade){
		this.idade = idade;
			}
	public int getIdade(){
		return this.idade;
	}
    
}

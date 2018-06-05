package Exercicio_1_2;

public class Pessoa {
	private String nome;
	private String endereco;
	private String telefone;
    
	public Pessoa(String nome, String endereco, String telefone){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}
	
	public void imprimir(){
		System.out.print("Nome: "+this.nome+" Endereço: "+this.telefone+" Telefone: "+this.telefone);
	}
	
	

}

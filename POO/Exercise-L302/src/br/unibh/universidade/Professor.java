package br.unibh.universidade;

public class Professor {
	private String nome;
	private int idade;
	
	
	public Professor(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	
	
	@Override
	public String toString() {
		return "Professor: " + nome + "";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getIdade(){
		return idade;
	}
	public void setIdade(int idade){
		this.idade = idade;
	}
	
	
	
	
	
	

	

}

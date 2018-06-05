package br.unibh.universidade;

public class Disciplina {
	private String nome;
	private boolean pratica;

	public Disciplina(String nome, boolean pratica){
		this.nome = nome;
		this.pratica = pratica;
	}
	
	
	public String getNome(){
		return nome;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
	public boolean isPratica() {
		return pratica;
	}
	public void setPratica(boolean pratica) {
		this.pratica = pratica;
	}


	@Override
	public String toString() {
		return "Disciplina: " + nome + "";
	}
	

	
}

package Pacote_4;

public class Produto {
	private  String nome;
	private double preco;
	private Etiqueta etiqueta;
	
	public Produto(String nome, double preco, Etiqueta etiqueta){
	     this.setNome(nome);
	     this.setPreco(preco);
	     this.etiqueta = etiqueta;
	}

	
	public void Produto2(String nome, double preco, String x, String y){
	     this.setNome(nome);
	     this.setPreco(preco);
	     Etiqueta etiqueta = new Etiqueta(x,y);
	
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Etiqueta getEtiqueta() {
		return etiqueta;
	}

	public void setEtiqueta(Etiqueta etiqueta) {
		this.etiqueta = etiqueta;
	}
	
	
	
	
	
	

}

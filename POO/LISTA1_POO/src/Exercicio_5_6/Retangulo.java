package Exercicio_5_6;

public class Retangulo {
	private double comprimento;
	private double largura;
	private double area;
	private double perimetro;

	public Retangulo(double comprimento, double largura, double area, double perimetro) {
		this.comprimento = comprimento;
		this.largura = largura;
		this.area = area;
		this.perimetro = perimetro;
	}

	public void calcularArea(){
		this.area = this.comprimento * this.largura;
	}
	
	public void calcularPerimetro(){
		this.perimetro = (2 * this.comprimento) + (2 * this.largura);
	}

	public void imprimir(){
		System.out.print("Comprimento: "+this.comprimento+" Largura: "+this.largura+" Area: "+this.area+" Perimentro: "+this.perimetro);
	}
	
}

package Exercicio_3_4;

public class Quadrado {
	private double lado;
	private double area;
	private double perimetro;
	
	public Quadrado(double lado, double area, double perimetro){
		this.lado = lado;
		this.area = area;
		this.perimetro = perimetro;
	}
	
	public void calcularArea(){
		this.area = this.lado * this.lado;
	}
	
	public void calcularPerimetro(){
		this.perimetro = 4 * this.lado;
	}
	
	public void imprimir(){
		System.out.print("Lado: "+this.lado+" Area: "+this.area+" perimetro: "+this.perimetro);
	}
	

}

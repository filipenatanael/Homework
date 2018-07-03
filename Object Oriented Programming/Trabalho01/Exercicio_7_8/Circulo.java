package Exercicio_7_8;

public class Circulo {
	private double raio;
	private double area;
	private double perimetro;
	
	
	
	public Circulo(double raio, double area, double perimetro) {
		this.raio = raio;
		this.area = area;
		this.perimetro = perimetro;
	}

	public void calcularArea(){
		this.area =  (3.14 * this.raio * this.raio);
	}
	
	public void calcularPerimetro(){
		this.perimetro = (2 * 3.14) * this.raio;
	}
	
	public void imprimir(){
		System.out.print("Raio: "+this.raio+" Area: "+this.area+" Perimetro: "+this.perimetro);
	}

}

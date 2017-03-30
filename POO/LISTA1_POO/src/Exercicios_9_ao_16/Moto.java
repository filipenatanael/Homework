package Exercicios_9_ao_16;

public class Moto {
	private String marca;
	private String modelo;
	private String cor;
	private int marcha;
	
	public Moto(String marca, String modelo, String cor, int marcha) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
	}

	
    public void marchaAcima(){
    	this.marcha += 1;
    } 
    
    public void marchaAbaixo(){
    	this.marcha -= 1;
    }


	public void imprimir(){
		System.out.print("Marca: "+this.marca+" Modelo: "+this.modelo+" Cor: "+this.cor+" Marcha: "+this.marcha);
	}
	

}

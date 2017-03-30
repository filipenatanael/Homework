package Exercicios_9_ao_16;

public class Moto {
	private String marca;
	private String modelo;
	private String cor;
	private int marcha;
	private int menorMarcha;
	private int maiorMarcha;
	
	public Moto(String marca, String modelo, String cor, int marcha) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
	}

	
    public void marchaAcima(){
    	if(this.marcha < this.maiorMarcha){
    		this.marcha += 1;
    	}
    } 
    
    public void marchaAbaixo(){
    	if(this.marcha > this.menorMarcha){
    		this.marcha -= 1;
    	}
    }


	public void imprimir(){
		System.out.print("Marca: "+this.marca+" Modelo: "+this.modelo+" Cor: "+this.cor+" Marcha: "+this.marcha);
		System.out.print("Maior Marcha: "+this.maiorMarcha+" Menor Marcha: "+this.menorMarcha);
	}
	

}

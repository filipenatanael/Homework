package Exercicios_9_ao_16;

public class Moto {
	private String marca;
	private String modelo;
	private String cor;
	private int marcha;
	private int menorMarcha;
	private int maiorMarcha;
	private boolean ligada;
	
    public Moto(String marca, String modelo, String cor, int marcha, int menorMarcha, int maiorMarcha, boolean ligada) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.marcha = marcha;
		this.menorMarcha = menorMarcha;
		this.maiorMarcha = maiorMarcha;
		this.ligada = ligada;
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
    
    public void ligar(){
    	if(this.ligada = false){
    		this.ligada = true;
    	}
    }
    
    public void desligar(){
    	if(this.ligada = true){
    		this.ligada = false;
    	}
    }
    
    public String marchaReferente(int status){
    	String retorno;
    	switch(status){
    	case 0:
    		retorno = "Neutro";
    		break;
    	case 1:
    		retorno = "Primeira marcha";
    		break;
    	case 3:
    		retorno = "Terceira marcha";
    		break;
    	case 4:
    		retorno = "Quarta marcha";
    		break;
    	case 5:
    		retorno = "Quinta marcha";
    	    break;
    	default:
    		retorno = "Ocorreu algum erro com o status!";
    	}
		return retorno;
    }

    
    

	public void imprimir(){
		System.out.print("Marca: "+this.marca+" Modelo: "+this.modelo+" Cor: "+this.cor);
		System.out.print("\n\nMaior Marcha: "+this.maiorMarcha+" Menor Marcha: "+this.menorMarcha);
		
		System.out.print("\n\nMarcha atual: "+marchaReferente(this.marcha));
		System.out.print("\n\nStatus: "+this.ligada);
	}
	

}

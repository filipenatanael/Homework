package Exercicios_9_ao_16;

public class Testando {

	public static void main(String[] args) {
		
		//private String marca;
		//private String modelo;
		//private String cor;
		/////private int marcha;
		//private int menorMarcha;
		//private int maiorMarcha;
		//private boolean ligada;
		
		Moto m = new Moto("Honda","SB600","Vermelho",5,0,5,false);
		m.marchaAbaixo();
		m.marchaAbaixo();
		m.imprimir();

	}

}

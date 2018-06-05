package Pacote_5;

public class Escopo {
	
	public static void main(String[] args) {
		int i = 5;
		int valor;
		int j = 0;
		for(j = 0; j < 6; j++){
		System.out.println(j);
		}
		
		System.out.println(i);
		
		//(J) ESSA VARIAVEL ERA LOCAL, FUNCIONA SOMENTE DENTRO DO (IF)
		System.out.println(j);
		
		
		if(i == 5){
		//int valor = 10; "ERRADO"
		valor = 10;       //CERTO
		}else{
		//valor = 12; ESSA VARIAVEL ERA LOCAL DO PRIMEIRO (IF)
		valor = 12;
		}
		System.out.print(valor);
		}
	

}

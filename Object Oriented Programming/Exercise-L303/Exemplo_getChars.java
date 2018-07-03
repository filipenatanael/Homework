package Pacote;

public class Exemplo_getChars {
	public static void main(String[] args) {
		String nomeCurso = new String("ANDAR");
		//É A DIFERENÇA DO 1º E 2º PARÂMETRO DO MÉTODO getChars
//SE DIMINUIR OS 2 O RESULTADO TEM QUE SER O MESMO INICIADO NO ARRAY
char[] numIndice = new char[5];

		nomeCurso.getChars(0, 3, numIndice, 0);
       		System.out.print("Valores Copiados \n");
       		
       		System.out.print(numIndice);
        		
       		for(char caracter : numIndice) 
        	 		System.out.print("["+caracter+"]");
         
        		System.out.println("\n\n Abaixo Índice demonstrativo dos valores copiados\n");
         
         		int[] b = {0,1,2,3,4,5,6};
         		for(int i = 0; i < b.length; i++)
        	 		System.out.print("["+b[i]+"]");

}
}

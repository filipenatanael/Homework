package Pacote;

public class Texto {
	
	
	public String contarVogais(String str){
		String mausculas = "aeiou";
		String minusculas = "AEIOU";
		int total_mausculas = 0;
		int total_minusculas = 0;
		
		for(int i=0; i< str.length(); i++){
			if(mausculas.indexOf(str[i])>=0 ){
				total_mausculas++;
			}else if(minusculas.indexOf(str[i])>=0){
				total_minusculas--;
			}
		}
		
		return total_mausculas+""+total_minusculas;	
	}
	
	
	public String conjugarVerbo(String verbo){
		int tamanho = verbo.length();
		tamanho -= 2;
		char[] nopresente = new char[tamanho];
		verbo.getChars(0, tamanho, nopresente, 0);
		
		return "\n\nVerbo: "+verbo+"Eu "+nopresente+"o"+"\nTu "+nopresente+"as"+"\nEle "+nopresente+"a"+"\nNos "+nopresente+"mos"+"\nVos "+nopresente+"ais"+"\nEles"+nopresente+"am";
		
	}
	
	public String obterInverso(String str){
		String temp = "";
		for(int i = str.length()-1; i >=0; i--){
			temp +=str.charAt(i);
		}
		return temp;	
	}
	
	
	public boolean palindromo(String polindromo){
		String inv_polindromo = obterInverso(polindromo);
		
		int retorno = polindromo.compareTo(inv_polindromo);
		if(retorno >0){
			return true;
		}
	    return false;
	}
	

}

package Pacote;

import java.util.Scanner;

/*
4) Implemente na classe main o objeto turma. 
   Enquanto o usuário desejar, solicite ao mesmos os dados do aluno + endereço e o adicone a turma.
   Ao final exiba todos os alunos da turma.
*/

public class MAINCLASS {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//boolean contador = true;
		
		
		Turma turma = new Turma(1);
		
        
        String nome;
        String RA;
        int opcao = 1;
        
		do{
		System.out.print("\nNome do aluno: ");
		nome = input.next();
		System.out.print("\nRA: ");
		RA = input.next();
		Aluno aluno = new Aluno(nome,RA);
		
		Endereco endereco = new Endereco();
		
		System.out.print("\nLocagouro: ");
	
		
		endereco.setLogradouro(input.next());
		System.out.print("\nBairro: ");
		endereco.setBairro(input.next());
		System.out.print("\nCidade: ");
		endereco.setCidade(input.next());
		
		//ADICIONANDO ALUNO NA TURMA
	    aluno.setEndereco(endereco);
	    turma.AdiconarAlunos(aluno);
		
		System.out.print("\n\nDeseja continuar adicionando? [1]=yes [2]=no >> ");
		opcao = input.nextInt();
	    if(opcao==2){
	    		
	    		
	    	break;
	    }
		
	    
	   
		}while(true);
		
		turma.ImprimirDados();
		
		
		
		
		
		
		
	}
	

}

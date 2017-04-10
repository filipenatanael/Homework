package Pacote;

import java.util.ArrayList;

/*
3) Implemente a classe Turma conendo os atributos  periodo e uma kluista contendo os alunos da turma.
   Implemente um método que perimita adicionar alunos a turma. 
   Implemente um método que exiba todos os dados dos alunos da turma.
*/

public class Turma {
   private int periodo;
   private ArrayList <Aluno> listaDeAlunos = new ArrayList<Aluno>();
   
   public Turma(int periodo){
	   this.periodo = periodo;
   }
   
   public void AdiconarAlunos(Aluno aluno){
	   this.listaDeAlunos.add(aluno);
   }
   
   
   public void ImprimirDados(){
	   int i;
	   
	   for(i=0;i<listaDeAlunos.size();i++){
		   System.out.print("\nNome"+listaDeAlunos.get(i).toString());
	   }
	   }
	
		   
   }

   


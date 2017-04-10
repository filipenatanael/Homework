package Pacote;
/*
2)Implemente uma classe Aluno contendo os atributos RA, Nome, Endere�o.
  Implemente um construtor que receba o nome e o RA do aluno. 
  Sobrescreva o m�todo ToString de forma a exibir o valor de todos os atributos da classe. 
*/
public class Aluno {
   private String RA;
   private String nome;
   private Endereco endereco;
   
   public Aluno(String nome, String RA)
   {
	   this.nome = nome;
	   this.RA = RA;
   }


   @Override
   public String toString() {
	return "Aluno [RA=" + RA + ", nome=" + nome + ", endereco=" + endereco + "]";
   }


   
public Endereco getEndereco() {
	return endereco;
}


public void setEndereco(Endereco endereco) {
	this.endereco = endereco;
}
   
   
   
   
   
   
   
}

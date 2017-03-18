package Pacote; 

public class MainClass {

	public static void main(String[] args) {
		
		PessoaFisica p = new PessoaFisica("Carlos");
		System.out.print("\nNome: "+p.getPrimeiroNome());
		System.out.print("\nIdade: "+p.getIdade());
		
		p.setNome("Lucas");
		p.setIdade(25);
		System.out.print("\nNome: "+p.getPrimeiroNome());
		System.out.print("\nIdade: "+p.getIdade());
		
	}

}

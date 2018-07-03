package Pacote;

public class Principal {

	public static void main(String[] args) {
     
		Conta conta = new Conta();
		conta.setNumero(1245);
		conta.setAgencia(65823);
		conta.depositar(300);
		conta.sacar(100);
		System.out.print(conta.toString());
		
	}

}

package Pacotes;

public class CaixaEletronico {

	public static void main(String[] args) {
		
		//--- Conta normal ---
		Conta contaNormal = new Conta(0111,545651);
		contaNormal.depositar(3500.8);
		System.out.print("\nAgencia: "+contaNormal.getAgencia()+"\nNumero da conta: "+contaNormal.getNumero());
		System.out.print("\nSaldo: "+contaNormal.saldo);
		
		
		
		//--- Conta com limite ----
		ContaEspecial objeto = new ContaEspecial(0012,123456,80.8);
		
		System.out.print("\n\nAgencia: "+objeto.getAgencia()+"\nNumero da conta: "+objeto.getNumero());
		
		System.out.print("\nLimite de credito: "+objeto.getLimite());
		
		objeto.depositar(1000.5);

		System.out.print("\nSeu saldo atual é: "+objeto.saldo);
		
		

	}

}


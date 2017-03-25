package Pacote;

public class ContaEspecial extends Conta{
	private double limite;
	
	public ContaEspecial(int agencia, int numero, double limite) {
		super(agencia, numero);
		this.limite = limite;
	}
	
    @Override
	public void sacar(float valor){
	
		if(valor + this.limite < this.saldo){
	       this.saldo = this.saldo - valor;	
		}else{
			System.out.println("Valor não permitido!");
		}
	}
	
	public double getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	

}

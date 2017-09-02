package Pacotes;

//EM C# FICARIA ASIM: public class ContaEspecial : Conta{
public class ContaEspecial extends Conta{
	//Poderiam usar o float tambem
	private double limite;
	
	
	public ContaEspecial(int agencia, int numero, double limite) {
		//O equivalente do "super" no C# é o "base".
		super(agencia, numero);
		this.limite = limite;
	}
	

	@Override
	public void sacar(float valor){
		if(valor + this.limite < this.saldo){
	       this.saldo = this.saldo - valor;	
		}else{
			//EM C# FICARIA ASSIM: Console.WriteLine("Valor não permitido!");
			System.out.println("Valor não permitido!");
		}
	}
	
	
	@Override
	public void depositar(double valor){
	    	if(valor > 0){
	    		this.saldo = this.saldo + valor;
	    	}
	}
	    
	
	
    public double getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	

}

package Pacotes;

public class Conta {
    private int agencia;
    private int numero;
    protected double saldo;
	   
    public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = 0;
	}
    
    public void sacar(float valor){
    	if(valor < this.saldo){
    		this.saldo = this.saldo - valor;
    	}
    }
    
    public void depositar(double valor){
	    	if(valor > 0){
	    		this.saldo = this.saldo + valor;
	    	}
	}
    
    public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	

      
      
}

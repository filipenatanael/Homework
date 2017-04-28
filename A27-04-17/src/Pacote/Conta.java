package Pacote;

public abstract class Conta implements iConta {
	private String agencia;
	private String numero;
	private double saldo;
	
	public abstract double sacar(double valor);
	
	public boolean depositar(double valor){
		this.saldo = this.saldo + valor;
		return true;
	}
	
	public String getAgencia() {
		return agencia;
	}
	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	

}

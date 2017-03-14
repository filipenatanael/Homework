package Pacote;

public class Conta {
	private int numero;
	private int agencia;
	private double saldo;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", saldo=" + saldo + "]";
	}
	
	public void sacar(double valor){
		if(valor<0 || valor > this.saldo){
			System.out.print("Não é possivel sacar um valor negativo!\n");
		}else{
			this.saldo = this.saldo - valor;
			System.out.print("Saque realizado com sucesso!\n");
		}
	}
	
	public void depositar(double valor){
		if(valor < 0){
			System.out.print("Não é possivel depositar um valosr negativo!\n");
		}else{
			this.saldo = this.saldo + valor;
			System.out.print("Deposito realizado com sucesso!\n");
		}
	}
	
	
	
	


}

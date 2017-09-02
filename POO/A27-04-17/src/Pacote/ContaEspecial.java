package Pacote;

public class ContaEspecial extends Conta{
    private double limite;
	
    @Override
	public double sacar(double valor) {
		return 0;
	}

    public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
    
    

}

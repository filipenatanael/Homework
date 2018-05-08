package pkgReservaPassagemAerea;

public class Voo {
	
	private int voo;
	private String origem;
	private String destino;
	private int lugares;
	

	public Voo(int voo, String origem, String destino, int lugares) {
		super();
		this.voo = voo;
		this.origem = origem;
		this.destino = destino;
		this.lugares = lugares;
	}
	
	
	public int getVoo() {
		return voo;
	}
	public void setVoo(int voo) {
		this.voo = voo;
	}
	public String getOrigem() {
		return origem;
	}
	public void setOrigem(String origem) {
		this.origem = origem;
	}
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino = destino;
	}
	public int getLugares() {
		return lugares;
	}
	public void setLugares(int lugares) {
		this.lugares = lugares;
	}

	@Override
	public String toString() {
		return "\n" + voo + "\t" + origem + "\t" + destino + "\t" + lugares;
	}
	
	
}

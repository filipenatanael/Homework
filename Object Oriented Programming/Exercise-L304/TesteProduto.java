package Pacote_4;

public class TesteProduto {
	public static void main(String[] args){
		
		Etiqueta etq1 = new Etiqueta("POOL","GG");
		Produto pro1 = new Produto("CAMISA",25.0,etq1);
		
		System.out.println(pro1.getNome());
		System.out.println(pro1.getPreco());
		System.out.println(pro1.getEtiqueta().getMarca());
		System.out.println(pro1.getEtiqueta().getTamanho());
		
		
		Etiqueta etq2 = new Etiqueta("POOL","GG");
		Produto pro2 = new Produto("CAMISA",25.0,etq2);
		
		etq2.setMarca("DC");
		etq2.setTamanho("MM");
		pro2.setNome("CALSA");
		pro2.setPreco(23.0);
		
		System.out.println(pro2.getNome());
		System.out.println(pro2.getPreco());
		System.out.println(pro2.getEtiqueta().getMarca());
		System.out.println(pro2.getEtiqueta().getTamanho());
		
		
		pro1.Produto2(pro2.getNome(), pro2.getPreco(),pro2.getEtiqueta().getMarca(),pro2.getEtiqueta().getTamanho());
		
		System.out.println(pro1.getNome());
		System.out.println(pro1.getPreco());
		System.out.println(pro1.getEtiqueta().getMarca());
		System.out.println(pro1.getEtiqueta().getTamanho());
		
	}

}

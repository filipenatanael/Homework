package pkgReservaPassagemAerea;
import java.util.ArrayList;

import javax.swing.*;

public class Testing {
	static ArrayList<Voo> ListaDeVoo = new ArrayList<Voo>();
	 
	public static void main(String[] args) {
		
    System.out.print("Cadastrando voo(s) de teste...\n\n");
    CadTestVOO();
    
    
    if (JOptionPane.showConfirmDialog(null, "Deseja verificar dados?", "Confirmação do programa",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    	ListRegisteredVOO();
    }
    
    
    
    
   
		
		
	}

	public static void ListRegisteredVOO() {
		JTextArea saida = new JTextArea(10, 40);
		saida.setText("Numero\tOrigem\tDestino\tPassageiros");
		String dadosVoo = "";
		 for(Voo item: ListaDeVoo){
			 dadosVoo = dadosVoo + item.toString();
		 }
		saida.append(dadosVoo);
		JScrollPane scroll = new JScrollPane(saida);
		JOptionPane.showMessageDialog(null, scroll, "Dados dos vôos: ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void CadTestVOO() {
		Voo v1 = new Voo(1,"BHTE","SÃO PAULO",20);
		Voo v2 = new Voo(2,"SÃO PAULO","CURITIBA",25);
		Voo v3 = new Voo(3,"CURITIBA","JOINVILLE",15);
		ListaDeVoo.add(v1);
		ListaDeVoo.add(v2);
		ListaDeVoo.add(v3);
	}
	
}


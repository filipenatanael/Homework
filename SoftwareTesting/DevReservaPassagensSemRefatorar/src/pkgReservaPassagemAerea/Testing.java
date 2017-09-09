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
    
    int opcao1;
    String sopcao;
    do{
    	try{
    		opcao1 = Integer.parseInt(JOptionPane.showInputDialog(
    				"OPÇÕES\n\n"
    				+ "1 - Consulta\n"
    				+ "2 - Reservar\n"
    				+ "3 - Finalizar\n\n"));
    		
    		switch(opcao1){
    		case 1:
    			int opcao2;
    			boolean bool = true;
    			do{
    				try{
    					opcao2 = Integer.parseInt(JOptionPane.showInputDialog(
    							"CONSULTAR VÔOS \n\n"
    							+ "1 - Por  número  do  vôo\n"
    							+ "2 - Por  Origem\n3 - Por Destino\n"
    							+ "4 - Consulta Geral\n"
    							+ "5 - Voltar\n\n"));
    					switch(opcao2){
    					case 1:
    		    			break;
    					case 2:
    						sopcao = JOptionPane.showInputDialog("CONSULTAR VÔO POR ORIGEM DO VÔO\n\n" + "Informe a origem");
    						Boolean verOrigem = false;	
    						for(Voo item: ListaDeVoo){
   							 if(item.getOrigem().equalsIgnoreCase(sopcao)){
   								 JOptionPane.showMessageDialog(null, item.toString());
   								 verOrigem = true;
   							 }
   						    }
    						if(!verOrigem){
    							JOptionPane.showMessageDialog(null, "Origem não cadastrada no programa. Verifique","Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
    						}
    		    			break;
    					case 3:
    						sopcao = JOptionPane.showInputDialog("CONSULTAR VÔO POR DESTINO DO VÔO\n\n" + "Informe a origem");
    						Boolean verDestino = false;
    						for(Voo item: ListaDeVoo){
    							 if(item.getDestino().equalsIgnoreCase(sopcao)){
    								 JOptionPane.showMessageDialog(null, item.toString());
    								 verDestino = true;
    							 }
    						 }
    						if(!verDestino){
    							JOptionPane.showMessageDialog(null, "Origem não cadastrada no programa. Verifique","Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
    						}
    		    			break;
    					case 4:
    						ListRegisteredVOO();
    		    			break;
    					case 5:
    						bool = false;
    		    			break;
    		    		default:
    		    			System.out.print("This option does not exist...");
    					}
    				}catch (Exception e) {
    					JOptionPane.showMessageDialog(null,"\nTecla cancelar foi acionada\nou um erro inesperado ocorreu. \nO programa será finalizado");
    				}
    			}while(bool);
    			//break;
    		case 2:
    			break;
    		case 3:
    			break;
    		default:
    			System.out.println("This option does not exist...");
    		}
    		
    	}catch (Exception e) {
    		JOptionPane.showMessageDialog(null,"\nTecla cancelar foi acionada\nou um erro inesperado ocorreu. \nO programa será finalizado");
    		break;
    		}
    }while(true);
    
    
    
    
    
		
		
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


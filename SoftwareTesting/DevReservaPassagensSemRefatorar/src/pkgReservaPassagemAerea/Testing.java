package pkgReservaPassagemAerea;
import java.util.ArrayList;

import javax.swing.*;

public class Testing {
	static ArrayList<Voo> ListaDeVoo = new ArrayList<Voo>();
	 
	public static void main(String[] args) {
		
    System.out.print("Cadastrando voo(s) de teste...\n\n");
    CadTestVOO();
    
    
    if (JOptionPane.showConfirmDialog(null, "Deseja verificar dados?", "Confirma��o do programa",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
    	ListRegisteredVOO();
    }
    
    int opcao1;
    String sopcao;
    int opcao;
    do{
    	try{
    		opcao1 = Integer.parseInt(JOptionPane.showInputDialog(
    				"OP��ES\n\n"
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
    							"CONSULTAR V�OS \n\n"
    							+ "1 - Por  n�mero  do  v�o\n"
    							+ "2 - Por  Origem\n3 - Por Destino\n"
    							+ "4 - Consulta Geral\n"
    							+ "5 - Voltar\n\n"));
    					switch(opcao2){
    					case 1:
    						opcao = Integer.parseInt(JOptionPane.showInputDialog("CONSULTAR V�O POR N�MERO DO V�O\n\n" + "Informe o n�mero do v�o"));
    						if (opcao < 1 || opcao > ListaDeVoo.size()) {
    						JOptionPane.showMessageDialog(null, "N�mero do v�o Inexistente");
    						} else {
    							JOptionPane.showMessageDialog(null, ListaDeVoo.get(opcao).toString());
    						}
    		    			break;
    					case 2:
    						sopcao = JOptionPane.showInputDialog("CONSULTAR V�O POR ORIGEM DO V�O\n\n" + "Informe a origem");
    						Boolean verOrigem = false;	
    						for(Voo item: ListaDeVoo){
   							 if(item.getOrigem().equalsIgnoreCase(sopcao)){
   								 JOptionPane.showMessageDialog(null, item.toString());
   								 verOrigem = true;
   							 }
   						    }
    						if(!verOrigem){
    							JOptionPane.showMessageDialog(null, "Origem n�o cadastrada no programa. Verifique","Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
    						}
    		    			break;
    					case 3:
    						sopcao = JOptionPane.showInputDialog("CONSULTAR V�O POR DESTINO DO V�O\n\n" + "Informe a origem");
    						Boolean verDestino = false;
    						for(Voo item: ListaDeVoo){
    							 if(item.getDestino().equalsIgnoreCase(sopcao)){
    								 JOptionPane.showMessageDialog(null, item.toString());
    								 verDestino = true;
    							 }
    						 }
    						if(!verDestino){
    							JOptionPane.showMessageDialog(null, "Origem n�o cadastrada no programa. Verifique","Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
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
    					JOptionPane.showMessageDialog(null,"\nTecla cancelar foi acionada\nou um erro inesperado ocorreu. \nO programa ser� finalizado");
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
    		JOptionPane.showMessageDialog(null,"\nTecla cancelar foi acionada\nou um erro inesperado ocorreu. \nO programa ser� finalizado");
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
		JOptionPane.showMessageDialog(null, scroll, "Dados dos v�os: ", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void CadTestVOO() {
		Voo v1 = new Voo(1,"BHTE","S�O PAULO",20);
		Voo v2 = new Voo(2,"S�O PAULO","CURITIBA",25);
		Voo v3 = new Voo(3,"CURITIBA","JOINVILLE",15);
		ListaDeVoo.add(v1);
		ListaDeVoo.add(v2);
		ListaDeVoo.add(v3);
	}
	
}


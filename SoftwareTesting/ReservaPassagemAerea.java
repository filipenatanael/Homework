/*
 * Ref. Fundamentos da programa��o de computadores
 * Ana Fernanda Ascencio e Edilene Campos
 * 2a. edi��o - P�gina 162 - 163
 */
package pkgReservaPassagemAerea;

import javax.swing.*;

public class ReservaPassagemAerea {
	static int opcao, opcao1, opcao2;
	static String sopcao;
	static int voo[];
	static String origem[];
	static String destino[];
	static int lugares[];
	static String dadosVoo = "";
	
	public static void main(String[] args) {
     
	CadTestVOO();
		
	if (JOptionPane.showConfirmDialog(null, "Deseja verificar dados?", "Confirma��o do programa",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
	ListRegisteredVOO(); 
	}
	
	while (true) {
	try {
	opcao1 = Integer.parseInt(JOptionPane.showInputDialog(
	"OP��ES\n\n"
	+ "1 - Consulta\n"
	+ "2 - Reservar\n"
	+ "3 - Finalizar\n\n"));

	if (opcao1 == 1) {
	while (true) {
	try {
	opcao2 = Integer.parseInt(JOptionPane.showInputDialog(
	"CONSULTAR V�OS \n\n"
	+ "1 - Por  n�mero  do  v�o\n"
	+ "2 - Por  Origem\n3 - Por Destino\n"
	+ "4 - Consulta Geral\n"
	+ "5 - Voltar\n\n"));
	if (opcao2 == 1) {
	opcao = Integer.parseInt(JOptionPane.showInputDialog("CONSULTAR V�O POR N�MERO DO V�O\n\n" + "Informe o n�mero do v�o"));
	if (opcao < 1 || opcao > voo.length) {
	JOptionPane.showMessageDialog(null, "N�mero do v�o Inexistente");
	} else {
	for (int i = 0; i <= 2; i++) {
	if (voo[i] == (opcao)) {
	String resultado = "V�o: " + voo[i] + "\n" + "Origem: "
	+ origem[i] + "\n" + "Destino: "+ destino[i] 
	+ "\n" + "Lugares: " + lugares[i];
	JOptionPane.showMessageDialog(null, resultado);
    }
	}
	}
	} // FIM DA OP��O 1
	
	if (opcao2 == 2) {
	sopcao = JOptionPane.showInputDialog("CONSULTAR V�O POR ORIGEM DO V�O\n\n" + "Informe a origem");
	Boolean verOrigem = true;
	if (verVPO(sopcao) == false)
	JOptionPane.showMessageDialog(null, "Origem n�o cadastrada no programa. Verifique","Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
	else {
	for (int i = 0; i <= 2; i++) {
	if (origem[i].equalsIgnoreCase(sopcao)) {	
	String resultado = "V�o: " + voo[i] + "\n" + "Origem: "
	+ origem[i] + "\n" + "Destino: "+ destino[i] 
	+ "\n" + "Lugares: " + lugares[i];
	JOptionPane.showMessageDialog(null, resultado);	
	}
	} 
	} 
	}
	
	if (opcao2 == 3) {
	sopcao = JOptionPane.showInputDialog("CONSULTAR V�O POR DESTINO DO V�O\n\n" + "Informe a origem");
	Boolean verDestino = true;
	if (verVPD(sopcao) == false)
	JOptionPane.showMessageDialog(null, "Origem n�o cadastrada no programa. Verifique","Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
	else {
	for (int i = 0; i <= 2; i++) {
	if (destino[i].equalsIgnoreCase(sopcao)) {	
	String resultado = "V�o: " + voo[i] + "\n" + "Origem: "
	+ origem[i] + "\n" + "Destino: "+ destino[i] 
	+ "\n" + "Lugares: " + lugares[i];
	JOptionPane.showMessageDialog(null, resultado);	
	}
	} 
	}
	}
	
	if (opcao2 == 4) {
	ListRegisteredVOO();
	}
	if (opcao2 == 5) {
	break;
	}
	} catch (Exception e) {
	JOptionPane.showMessageDialog(null,"\nTecla cancelar foi acionada\nou um erro inesperado ocorreu. \nO programa ser� finalizado");
	break;
	}
	}
	
	} 
	if (opcao1 == 2) {
	JOptionPane.showMessageDialog(null, "OP��O 2 - RESERVA \nOp��o em desenvolvimento ...");
	}
	if (opcao1 == 3) {
	break;
	}
	} catch (Exception e) {
	JOptionPane.showMessageDialog(null,"\nTecla cancelar foi acionada\nou um erro inesperado ocorreu. \nO programa ser� finalizado");
	break;
	}
    }
	System.out.println("\n\nPROGRAMA FINALIZADO!");
	}

	public static void ListRegisteredVOO() {
		JTextArea saida = new JTextArea(10, 40);
		saida.setText("Nro\tOrigem\tDestino\tPassageiros");
		saida.append(dadosVoo);
		JScrollPane scroll = new JScrollPane(saida);
		JOptionPane.showMessageDialog(null, scroll, "Dados dos v�os: ", JOptionPane.INFORMATION_MESSAGE);
	}

	public static void CadTestVOO() {
		voo = new int[3];
		origem = new String[3];
		destino = new String[3];
		lugares = new int[3];
		
		voo[0] = 1;
		origem[0] = "BHTE";
		destino[0] = "S�O PAULO";
		lugares[0] = 20;
		dadosVoo = dadosVoo + "\n" + voo[0] + "\t"
		+ origem[0] + "\t" + destino[0] + "\t" + lugares[0];
		
		voo[1] = 2;
		origem[1] = "S�O PAULO";
		destino[1] = "CURITIBA";
		lugares[1] = 25;
		dadosVoo = dadosVoo + "\n" + voo[1] + "\t"
		+ origem[1] + "\t" + destino[1] + "\t" + lugares[1];
		
		voo[2] = 3;
		origem[2] = "CURITIBA";
		destino[2] = "JOINVILLE";
		lugares[2] = 15;
		dadosVoo = dadosVoo + "\n" + voo[2] + "\t"
		+ origem[2] + "\t" + destino[2] + "\t" + lugares[2];
	}

	private static Boolean verVPO(String args) {
	for (int i = 0; i <= 2; i++) {
		if (origem[i].equalsIgnoreCase(sopcao))
				return true;
					}
					return false;
							}

	private static Boolean verVPD(String args) {
		for (int i = 0; i <= 2; i++) {
			if (destino[i].equalsIgnoreCase(sopcao))
				return true;
								}
							return false;
									}
}


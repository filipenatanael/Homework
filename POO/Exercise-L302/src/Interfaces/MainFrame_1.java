package Interfaces;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;

import br.unibh.universidade.Atribuicao;
import br.unibh.universidade.Disciplina;
import br.unibh.universidade.Professor;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainFrame_1 extends JFrame {

	private JPanel contentPane;
	private JTextField input_nome;
	private JTextField input_idade;
	private JTextField input_disciplina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame_1 frame = new MainFrame_1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainFrame_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 314);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setBounds(28, 23, 46, 14);
		contentPane.add(lblNome);
		
		input_nome = new JTextField();
		input_nome.setBounds(27, 48, 153, 20);
		contentPane.add(input_nome);
		input_nome.setColumns(10);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setBounds(28, 79, 46, 14);
		contentPane.add(lblIdade);
		
		input_idade = new JTextField();
		input_idade.setBounds(28, 97, 86, 20);
		contentPane.add(input_idade);
		input_idade.setColumns(10);
		
		JLabel lblDisciplina = new JLabel("Disciplina:");
		lblDisciplina.setBounds(28, 131, 71, 14);
		contentPane.add(lblDisciplina);
		
		input_disciplina = new JTextField();
		input_disciplina.setBounds(28, 151, 152, 20);
		contentPane.add(input_disciplina);
		input_disciplina.setColumns(10);
		
		JLabel lblBoolean = new JLabel("Boolean: ");
		lblBoolean.setBounds(28, 181, 46, 14);
		contentPane.add(lblBoolean);
		
		JRadioButton rdbtnTrue = new JRadioButton("True");
		rdbtnTrue.setBounds(28, 202, 54, 23);
		contentPane.add(rdbtnTrue);
		
		JTextArea retorno = new JTextArea();
		retorno.setBounds(208, 46, 216, 126);
		contentPane.add(retorno);
		
		JButton btnNewButton = new JButton("Cadastro");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String professor = input_nome.getText();
				int idade = Integer.parseInt(input_idade.getText());
				String disciplina = input_idade.getText();
				
				boolean bool = false;
				
				if (rdbtnTrue.isSelected()) {
					bool = true;
				}
				
				Professor prof = new Professor(professor,idade);
				Disciplina disp = new Disciplina(disciplina,bool);
				Atribuicao atr = new Atribuicao(prof,disp);
				
				retorno.setText(atr.toString());
				//System.out.printf(atr.toString());
				
			}
		});
		btnNewButton.setBounds(208, 202, 216, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblFalsePadro = new JLabel("(False \u00E9 padr\u00E3o).");
		lblFalsePadro.setBounds(28, 233, 152, 14);
		contentPane.add(lblFalsePadro);
	}
}

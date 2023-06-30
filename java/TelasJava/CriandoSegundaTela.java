package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CriandoSegundaTela {

	private JFrame frmUnindoNomeSobrenome;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JTextField txtNomeSobrenome;
	private JButton btnUnir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CriandoSegundaTela window = new CriandoSegundaTela();
					window.frmUnindoNomeSobrenome.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CriandoSegundaTela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmUnindoNomeSobrenome = new JFrame();
		frmUnindoNomeSobrenome.setTitle("Unindo Nome Sobrenome");
		frmUnindoNomeSobrenome.setBounds(100, 100, 416, 506);
		frmUnindoNomeSobrenome.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmUnindoNomeSobrenome.getContentPane().setLayout(null);
		
		// Para centralizar a tela:
		frmUnindoNomeSobrenome.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(25, 23, 69, 25);
		frmUnindoNomeSobrenome.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtNome.setBounds(25, 59, 342, 31);
		frmUnindoNomeSobrenome.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSobrenome = new JLabel("Sobrenome");
		lblSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblSobrenome.setBounds(25, 137, 116, 25);
		frmUnindoNomeSobrenome.getContentPane().add(lblSobrenome);
		
		txtSobrenome = new JTextField();
		txtSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtSobrenome.setColumns(10);
		txtSobrenome.setBounds(25, 173, 342, 31);
		frmUnindoNomeSobrenome.getContentPane().add(txtSobrenome);
		
		JLabel lblNomeCompletoi = new JLabel("Nome Completo");
		lblNomeCompletoi.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNomeCompletoi.setBounds(25, 249, 195, 25);
		frmUnindoNomeSobrenome.getContentPane().add(lblNomeCompletoi);
		
		txtNomeSobrenome = new JTextField();
		txtNomeSobrenome.setFont(new Font("Tahoma", Font.PLAIN, 26));
		txtNomeSobrenome.setColumns(10);
		txtNomeSobrenome.setBounds(25, 285, 342, 31);
		frmUnindoNomeSobrenome.getContentPane().add(txtNomeSobrenome);
		
		btnUnir = new JButton("Unir Nome e Sobrenome");
		btnUnir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtNomeSobrenome.setText(txtNome.getText() + " " + txtSobrenome.getText() );
				
			}
		});
		btnUnir.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnUnir.setBounds(25, 384, 342, 45);
		frmUnindoNomeSobrenome.getContentPane().add(btnUnir);
	}
}

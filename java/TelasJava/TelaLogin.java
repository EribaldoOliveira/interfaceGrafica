package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaLogin {

	private JFrame frame;
	private JTextField txtNome;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaLogin() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 611, 435);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(36, 88, 465, 30);
		frame.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setBounds(36, 118, 473, 30);
		frame.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel txtSenha = new JLabel("Senha");
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSenha.setBounds(40, 180, 465, 30);
		frame.getContentPane().add(txtSenha);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(40, 210, 469, 30);
		frame.getContentPane().add(textField);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtNome.getText().equals("Amanda") && txtSenha.getText() .equals("123")) {
					
					JOptionPane.showMessageDialog(null, "Usuário Logado com Sucesso!!!");
				
				}else {
					
					JOptionPane.showMessageDialog(null, "Usuário ou senha inválido!!");
					
				}
				
			}
		});
		btnLogar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnLogar.setBounds(40, 289, 469, 52);
		frame.getContentPane().add(btnLogar);
	}
}

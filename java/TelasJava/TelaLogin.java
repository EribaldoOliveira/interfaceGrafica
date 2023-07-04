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
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;

public class TelaLogin {

	private JFrame frmTelaDeLogin;
	private JTextField txtNome;
	private JPasswordField passwordField_Senha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaLogin window = new TelaLogin();
					window.frmTelaDeLogin.setVisible(true);
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
		frmTelaDeLogin = new JFrame();
		frmTelaDeLogin.setTitle("Tela de Login");
		frmTelaDeLogin.getContentPane().setBackground(new Color(175, 238, 238));
		frmTelaDeLogin.setBounds(100, 100, 611, 526);
		frmTelaDeLogin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmTelaDeLogin.getContentPane().setLayout(null);
		
		// Para centralizar a tela:
		frmTelaDeLogin.setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Nome");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(50, 207, 465, 30);
		frmTelaDeLogin.getContentPane().add(lblNewLabel);
		
		txtNome = new JTextField();
		txtNome.setForeground(Color.BLACK);
		txtNome.setBackground(SystemColor.info);
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNome.setBounds(50, 237, 473, 30);
		frmTelaDeLogin.getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		JLabel txtSenha = new JLabel("Senha");
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSenha.setBounds(54, 278, 465, 30);
		frmTelaDeLogin.getContentPane().add(txtSenha);
		
		JButton btnLogar = new JButton("Logar");
		btnLogar.setForeground(new Color(0, 0, 0));
		btnLogar.setBackground(new Color(30, 144, 255));
		btnLogar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtNome.getText().equals("Eribaldo") && passwordField_Senha.getText().equals("123") ) {
					
					JOptionPane.showMessageDialog(null, "Usuário Logado com Sucesso!!!");
				
				}else {
					
					JOptionPane.showMessageDialog(null, "Usuário ou senha inválido(a)!");
					
				}
				
			}
		});
		btnLogar.setFont(new Font("Tahoma", Font.PLAIN, 26));
		btnLogar.setBounds(199, 398, 191, 52);
		frmTelaDeLogin.getContentPane().add(btnLogar);
		
		passwordField_Senha = new JPasswordField();
		passwordField_Senha.setBackground(SystemColor.info);
		passwordField_Senha.setFont(new Font("Tahoma", Font.PLAIN, 20));
		passwordField_Senha.setBounds(50, 318, 473, 30);
		frmTelaDeLogin.getContentPane().add(passwordField_Senha);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setIcon(new ImageIcon(TelaLogin.class.getResource("/imagens/usuario.png")));
		lblNewLabel_1.setBounds(0, 11, 595, 185);
		frmTelaDeLogin.getContentPane().add(lblNewLabel_1);
	}
}

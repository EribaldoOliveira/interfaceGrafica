package TelasJava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Window;
import java.text.ParseException;

import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import javax.swing.JFormattedTextField;

public class Mascara_Data_CPF_CNPJ_Telefone {

	private JFrame frmMscaras;
	private JLabel lblCPF;
	private JLabel lblCnpj;
	private JLabel lblTelefone;
	
	private static MaskFormatter mascaraData;
	private static MaskFormatter mascaraCPF;
	private static MaskFormatter mascaraCNPJ;
	private static MaskFormatter mascaraTelefone;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mascara_Data_CPF_CNPJ_Telefone window = new Mascara_Data_CPF_CNPJ_Telefone();
					window.frmMscaras.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Mascara_Data_CPF_CNPJ_Telefone() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMscaras = new JFrame();
		frmMscaras.setTitle("Máscaras");
		frmMscaras.setBounds(100, 100, 482, 424);
		frmMscaras.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMscaras.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Data");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 441, 32);
		frmMscaras.getContentPane().add(lblNewLabel);
		
		lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCPF.setBounds(10, 91, 441, 32);
		frmMscaras.getContentPane().add(lblCPF);
		
		lblCnpj = new JLabel("CNPJ");
		lblCnpj.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCnpj.setBounds(10, 191, 441, 32);
		frmMscaras.getContentPane().add(lblCnpj);
		
		lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTelefone.setBounds(10, 291, 441, 32);
		frmMscaras.getContentPane().add(lblTelefone);
		
		JFormattedTextField txtData = new JFormattedTextField( arrumaMascaraData() );
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtData.setBounds(10, 48, 441, 32);
		frmMscaras.getContentPane().add(txtData);
		
		JFormattedTextField txtCPF = new JFormattedTextField( arrumaMascaraCPF() );
		txtCPF.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCPF.setBounds(10, 134, 441, 32);
		frmMscaras.getContentPane().add(txtCPF);
		
		JFormattedTextField txtCNPJ = new JFormattedTextField( arrumaMascaraCNPJ( ) );
		txtCNPJ.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCNPJ.setBounds(10, 234, 441, 32);
		frmMscaras.getContentPane().add(txtCNPJ);
		
		JFormattedTextField txtTelefone = new JFormattedTextField( arrumaMascaraTelefone( ) );
		txtTelefone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtTelefone.setBounds(10, 331, 441, 32);
		frmMscaras.getContentPane().add(txtTelefone);
		
	}
	
	//Método
	public static MaskFormatter arrumaMascaraData( ) {
		
		try {
			mascaraData = new MaskFormatter("##/##/####");
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		mascaraData.setPlaceholderCharacter('_');
		
		return mascaraData;
		
	}
	
	//Método
		public static MaskFormatter arrumaMascaraCPF( ) {
			
			try {
				mascaraCPF = new MaskFormatter("###.###.### - ##");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			mascaraCPF.setPlaceholderCharacter('_');
			
			return mascaraCPF;
			
		}
		
		//Método
		public static MaskFormatter arrumaMascaraCNPJ( ) {
			
			try {
				mascaraCNPJ = new MaskFormatter("##.###.###/####-##");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			mascaraCNPJ.setPlaceholderCharacter('_');
			
			return mascaraCNPJ;
			
		}
		
		//Método
		public static MaskFormatter arrumaMascaraTelefone( ) {
			
			try {
				mascaraTelefone = new MaskFormatter("(##) #####-####");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			mascaraTelefone.setPlaceholderCharacter('_');
			
			return mascaraTelefone;
			
		}
	
}

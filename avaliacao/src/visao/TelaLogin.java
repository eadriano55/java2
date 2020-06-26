package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class TelaLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textUsuario;
	private JLabel lblLogin, lblUsuario, lblSenha;
	private JButton btnCancelar, btnEnviar;
	private JPasswordField textSenha;

	public TelaLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblLogin.setBounds(194, 32, 64, 14);
		contentPane.add(lblLogin);
		
		lblUsuario = new JLabel("USU\u00C1RIO");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsuario.setBounds(38, 88, 78, 14);
		contentPane.add(lblUsuario);
		
		lblSenha = new JLabel("SENHA");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(38, 113, 78, 14);
		contentPane.add(lblSenha);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(156, 87, 196, 20);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelar.setBounds(38, 179, 131, 23);
		contentPane.add(btnCancelar);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEnviar.setBounds(221, 181, 131, 23);
		contentPane.add(btnEnviar);
		
		textSenha = new JPasswordField();
		textSenha.setBounds(156, 112, 196, 20);
		contentPane.add(textSenha);
		
		setVisible(true);
	}
	public void adicionarOuvinteLogin (ActionListener ouvinte) {
		this.btnCancelar.addActionListener(ouvinte);
		this.btnEnviar.addActionListener(ouvinte);
	}
	public String getSenha() {
		return String.valueOf(textSenha.getPassword());
	}
	public String getUsuario() {
		return textUsuario.getText();
	}
}

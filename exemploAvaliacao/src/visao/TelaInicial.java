package visao;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class TelaInicial extends JFrame{
	private JButton btnEnviar;
	private JButton btnCancelar;
	private JTextField txtUsuario;
	private JLabel lblUsuario;
	private JLabel lblSenha;
	private JPasswordField txtSenha;

	public TelaInicial() {
		setTitle("LOGIN");
		setBounds(100, 100, 386, 238);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		lblUsuario = new JLabel("USU\u00C1RIO");
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblUsuario.setBounds(37, 42, 79, 17);
		getContentPane().add(lblUsuario);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEnviar.setBounds(191, 142, 133, 23);
		getContentPane().add(btnEnviar);
		
		lblSenha = new JLabel("SENHA");
		lblSenha.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSenha.setBounds(37, 88, 79, 17);
		getContentPane().add(lblSenha);
		
		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnCancelar.setBounds(37, 142, 133, 23);
		getContentPane().add(btnCancelar);
		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(155, 42, 169, 20);
		getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);
		
		txtSenha = new JPasswordField();
		txtSenha.setBounds(155, 88, 169, 20);
		getContentPane().add(txtSenha);
		
		setVisible(true);

	}
	public void adicionarOuvinteLogin (ActionListener ouvinte) {
		this.btnCancelar.addActionListener(ouvinte);
		this.btnEnviar.addActionListener(ouvinte);
	}
	public String getSenha() {
		return String.valueOf(txtSenha.getPassword());
	}
	public String getUsuario() {
		return txtUsuario.getText();
	}
}


package visao;

import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelaCadastro extends JFrame{
	private JPanel contentPane;
	private JTextField textCpf;
	private JTextField textNome;
	private JButton btnEnviar;
	private JButton btnLimpar;

	public TelaCadastro() {
		setTitle("CADASTRO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CADASTRO DE PESSOA");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(132, 34, 175, 36);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("CPF");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(64, 92, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(64, 141, 46, 14);
		contentPane.add(lblNome);
		
		textCpf = new JTextField();
		textCpf.setBounds(142, 91, 202, 20);
		contentPane.add(textCpf);
		textCpf.setColumns(10);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(142, 140, 202, 20);
		contentPane.add(textNome);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setBounds(64, 196, 127, 30);
		contentPane.add(btnLimpar);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setBounds(223, 196, 121, 30);
		contentPane.add(btnEnviar);
		
		setVisible(true);
	}
	
	public void adicionarOuvintePessoa(ActionListener ouvinte) {
		btnLimpar.addActionListener(ouvinte);
		btnEnviar.addActionListener(ouvinte);
	}
	
	public void limparCampos() {
		textCpf.setText("");
		textNome.setText("");
	}
	
	public String nomePessoa() {
		return (textNome.getText());
	}
	
	public String cpfPessoa() {
		return (textCpf.getText());
	}
}

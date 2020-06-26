package visao;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Aluno;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textMatricula, textNome, textTelefone;
	private JLabel lblTitulo, lblNome, lblTelefone, lblMatricula;
	private JButton btnLimpar, btnEnviar;
	private JScrollPane scrollAluno;
	private DefaultTableModel modelo;
	private JTable tabela;

	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 426, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblTitulo = new JLabel("CADASTRO DE ALUNOS");
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTitulo.setBounds(106, 25, 210, 23);
		contentPane.add(lblTitulo);
		
		lblNome = new JLabel("NOME");
		lblNome.setHorizontalAlignment(SwingConstants.LEFT);
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(53, 111, 153, 23);
		contentPane.add(lblNome);
		
		lblTelefone = new JLabel("TELEFONE");
		lblTelefone.setHorizontalAlignment(SwingConstants.LEFT);
		lblTelefone.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblTelefone.setBounds(53, 145, 153, 23);
		contentPane.add(lblTelefone);
		
		lblMatricula = new JLabel("MATRICULA");
		lblMatricula.setHorizontalAlignment(SwingConstants.LEFT);
		lblMatricula.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblMatricula.setBounds(53, 77, 153, 23);
		contentPane.add(lblMatricula);
		
		textMatricula = new JTextField();
		textMatricula.setBounds(185, 80, 170, 20);
		contentPane.add(textMatricula);
		textMatricula.setColumns(10);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(185, 114, 170, 20);
		contentPane.add(textNome);
		
		textTelefone = new JTextField();
		textTelefone.setColumns(10);
		textTelefone.setBounds(185, 148, 170, 20);
		contentPane.add(textTelefone);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpar.setBounds(53, 200, 130, 23);
		getContentPane().add(btnLimpar);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnEnviar.setBounds(225, 200, 130, 23);
		getContentPane().add(btnEnviar);
		
		modelo = new DefaultTableModel();
		modelo.addColumn("Matrícula");
		modelo.addColumn("Nome");
		modelo.addColumn("Telefone");
		tabela = new JTable(modelo);
		
		scrollAluno = new JScrollPane(tabela);
		scrollAluno.setBounds(53, 254, 304, 130);
		getContentPane().add(scrollAluno);
		tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
				
		scrollAluno.setVisible(false);
		setVisible(true);
	}
	public void adicionaTabelaAluno(Aluno a) {
		Object[] aluno = {a.getMatricula(), a.getNome(), a.getTelefone()};
		modelo.addRow(aluno);
	}
	public void habilitaScroll() {
		scrollAluno.setVisible(true);
	}
	public void adicionarOuvinte(ActionListener ouvinte) {
		btnLimpar.addActionListener(ouvinte);
		btnEnviar.addActionListener(ouvinte);
	}
	public String getMat() {
		return (textMatricula.getText());
	}
	public String getNome() {
		return (textNome.getText());
	}
	public String getTel() {
		return (textTelefone.getText());
	}
	public void limparCampos() {
		textMatricula.setText("");
		textNome.setText("");
		textTelefone.setText("");
	}
}

package visao;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import modelo.Produto;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaCadastroProd extends JFrame {

	private JPanel contentPane;
	private JTextField textCod, textNome, textPreco, textQtde;
	private JLabel lblCadastroDeProdutos, lblQtde, lblCod, lblNome, lblPreco;
	private JButton btnLimpar, btnEnviar;
	private DefaultTableModel modelo;
	private JTable tabela;
	private JScrollPane scrollProduto;

	public TelaCadastroProd() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 409, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCadastroDeProdutos = new JLabel("CADASTRO DE PRODUTOS");
		lblCadastroDeProdutos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroDeProdutos.setBounds(104, 11, 192, 14);
		contentPane.add(lblCadastroDeProdutos);
		
		lblQtde = new JLabel("QTDESTOQUE");
		lblQtde.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblQtde.setBounds(32, 121, 98, 14);
		contentPane.add(lblQtde);
		
		lblCod = new JLabel("C\u00D3DIGO");
		lblCod.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCod.setBounds(32, 46, 98, 14);
		contentPane.add(lblCod);
		
		lblNome = new JLabel("NOME");
		lblNome.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNome.setBounds(32, 71, 98, 14);
		contentPane.add(lblNome);
		
		lblPreco = new JLabel("PRE\u00C7O");
		lblPreco.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPreco.setBounds(32, 96, 98, 14);
		contentPane.add(lblPreco);
		
		textCod = new JTextField();
		textCod.setBounds(157, 45, 192, 20);
		contentPane.add(textCod);
		textCod.setColumns(10);
		
		textNome = new JTextField();
		textNome.setColumns(10);
		textNome.setBounds(157, 70, 192, 20);
		contentPane.add(textNome);
		
		textPreco = new JTextField();
		textPreco.setColumns(10);
		textPreco.setBounds(157, 95, 192, 20);
		contentPane.add(textPreco);
		
		textQtde = new JTextField();
		textQtde.setColumns(10);
		textQtde.setBounds(157, 120, 192, 20);
		contentPane.add(textQtde);
		
		btnLimpar = new JButton("LIMPAR");
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLimpar.setBounds(32, 167, 131, 23);
		contentPane.add(btnLimpar);
		
		btnEnviar = new JButton("ENVIAR");
		btnEnviar.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnEnviar.setBounds(218, 167, 131, 23);
		contentPane.add(btnEnviar);

		modelo = new DefaultTableModel();
		modelo.addColumn("Código");
		modelo.addColumn("Nome");
		modelo.addColumn("Preço");
		modelo.addColumn("QtdEstoque");
		tabela = new JTable(modelo);
		
		scrollProduto = new JScrollPane(tabela);
		scrollProduto.setBounds(53, 254, 304, 130);
		getContentPane().add(scrollProduto);
		tabela.getColumnModel().getColumn(0).setPreferredWidth(40);
				
		scrollProduto.setVisible(false);
		setVisible(true);
	}
	public void adicionaTabelaProduto(Produto a) {
		Object[] produto = {a.getCodigo(), a.getNome(), a.getPreco(), a.getQtde()};
		modelo.addRow(produto);
	}
	public void habilitaScroll() {
		scrollProduto.setVisible(true);
	}
	public void adicionarOuvinte(ActionListener ouvinte) {
		btnLimpar.addActionListener(ouvinte);
		btnEnviar.addActionListener(ouvinte);
	}
	public String getCodigo() {
		return (textCod.getText());
	}
	public String getNome() {
		return (textNome.getText());
	}
	public String getPreco() {
		return (textPreco.getText());
	}
	public String getQtde() {
		return (textQtde.getText());
	}
	public void limparCampos() {
		textCod.setText("");
		textNome.setText("");
		textPreco.setText("");
		textQtde.setText("");
	}
}

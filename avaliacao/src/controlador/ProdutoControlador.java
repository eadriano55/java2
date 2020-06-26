package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import controlador.ProdutoControlador.OuvinteProduto;
import modelo.Produto;
import visao.TelaCadastroProd;

	public class ProdutoControlador {
		private TelaCadastroProd tela;

		public ProdutoControlador() {
			tela = new TelaCadastroProd();
			tela.adicionarOuvinte(new OuvinteProduto());
		}
		
	class OuvinteProduto implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("LIMPAR")) {
				tela.limparCampos();
			} else {
				if (e.getActionCommand().contentEquals("ENVIAR")) {
					String c, n, p, q;
					c = tela.getCodigo();
					n = tela.getNome();
					p = tela.getPreco();
					q = tela.getQtde();
					if (c.equals("") || (n.equals("")) || (p.contentEquals("")) || (q.equals(""))) {
						JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", 0);
					} else {
						Produto a = new Produto(c, n, p, q);
						tela.adicionaTabelaProduto(a);
						tela.habilitaScroll();
						JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!", "Resultado", 1);
					}
					tela.limparCampos();
				}
			}
		}
	}
	}


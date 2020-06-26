package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import modelo.Aluno;
import visao.TelaCadastro;

public class AlunoControlador {
	private TelaCadastro tela;

	public AlunoControlador() {
		tela = new TelaCadastro();
		tela.adicionarOuvinte(new OuvinteAluno());
	}
	class OuvinteAluno implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equals("LIMPAR")) {
				tela.limparCampos();
			} else {
				if (e.getActionCommand().contentEquals("ENVIAR")) {
					String m, n, t;
					m = tela.getMat();
					n = tela.getNome();
					t = tela.getTel();
					if (m.equals("") || (n.equals("")) || (t.contentEquals(""))) {
						JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos!", "Erro", 0);
					} else {
						Aluno a = new Aluno(m, n, t);
						tela.adicionaTabelaAluno(a);
						tela.habilitaScroll();
						JOptionPane.showMessageDialog(null, "Dados cadastrados com sucesso!", "Resultado", 1);
					}
				}
			}
		}
	}
}

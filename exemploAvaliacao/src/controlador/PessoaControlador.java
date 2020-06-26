package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Pessoa;
import visao.TelaCadastro;

public class PessoaControlador {
	private TelaCadastro pGUI;

	public PessoaControlador() {
		pGUI = new TelaCadastro();
		pGUI.adicionarOuvintePessoa(new OuvintePessoa());
	}

	public Pessoa obterPessoa() {
		Pessoa p = new Pessoa(pGUI.nomePessoa(), pGUI.cpfPessoa());
		return p;
	}

	class OuvintePessoa implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand() == "LIMPAR") {
				pGUI.limparCampos();
			} else {
				if (e.getActionCommand() == "ENVIAR") {
					String nome = pGUI.nomePessoa();
					String cpf = pGUI.cpfPessoa();

					if ((nome.equals("")) && (cpf.equals(""))) {
						JOptionPane.showMessageDialog(null, "Preencha os dois campos!");
					} else if ((!nome.equals("")) && (cpf.contentEquals(""))) {
						JOptionPane.showMessageDialog(null, "Preencha o campo do CPF!");
					} else if ((nome.equals("")) && (!cpf.contentEquals(""))) {
						JOptionPane.showMessageDialog(null, "Preencha o campo do Nome!");
					} else {
						Pessoa pes = obterPessoa(); // comandos para armazenamento BD
						JOptionPane.showMessageDialog(pGUI, "Dados cadastrados!!!", "Resultado", 1);
						pGUI.limparCampos();
					}
				}
			}
		}
	}
}

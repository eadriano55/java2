package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import modelo.Pessoa;
import visao.TelaInicial;

public class LoginControlador {
private TelaInicial iniLog;
	
	public LoginControlador() {
		iniLog = new TelaInicial();
		iniLog.adicionarOuvinteLogin(new OuvinteLogin());
	}
	public Pessoa obterPessoa() {
		Pessoa p = new Pessoa(tela.nomePessoa(), tela.cpfPessoa());
		return p;
	}
	class OuvinteLogin implements ActionListener {
		public void actionPerformed (ActionEvent ev) {
			if (ev.getActionCommand()=="ENVIAR") {
				String usuario = iniLog.getUsuario();
				String senha = iniLog.getSenha();
				if ((senha.compareTo("1234")==0)&& (usuario.compareTo("teste")==0)) {
					iniLog.dispose(); // fecha a janela do login
					PessoaControlador PessoalControl = new PessoaControlador();
				}
				else {
					JOptionPane.showMessageDialog(null, "Senha inválida!");
					System.exit(0);
				}
			}
			else System.exit(0);
		}

	}
}

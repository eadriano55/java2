package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import visao.TelaLogin;

public class LoginControlador {
private TelaLogin iniLog;
	
	public LoginControlador() {
		iniLog = new TelaLogin();
		iniLog.adicionarOuvinteLogin(new OuvinteLogin());
	}
	class OuvinteLogin implements ActionListener {
		public void actionPerformed (ActionEvent ev) {
			if (ev.getActionCommand()=="ENVIAR") {
				String usuario = iniLog.getUsuario();
				String senha = iniLog.getSenha();
				if ((senha.compareTo("1234")==0)&& (usuario.compareTo("teste")==0)) {
					iniLog.dispose(); 
					ProdutoControlador ProdutoControl = new ProdutoControlador();
				}
				else {
					JOptionPane.showMessageDialog(null, "Senha inválida!");
				}
			}
			else System.exit(0);
		}

	}
}

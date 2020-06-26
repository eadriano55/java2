package testes;

import java.sql.SQLException;
import java.util.Scanner;
import dao.FuncionariosDao;
import modelo.Funcionario;


public class TestaInsereFuncionario {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		Funcionario c1 = new Funcionario();

		System.out.println("insira o nome: \n");
		c1.setNome(ler.nextLine());
		System.out.println("insira o usuario: \n");
		c1.setUsuario(ler.nextLine());
		System.out.println("insira a senha: \n");
		c1.setSenha(ler.nextLine());
		ler.close();
		FuncionariosDao cdao;
		try {
			cdao = new FuncionariosDao();
			cdao.adiciona(c1);
			System.out.println("Gravação feita com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

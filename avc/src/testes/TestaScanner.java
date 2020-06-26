package testes;

import java.sql.SQLException;
import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class TestaScanner {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		Contato c1 = new Contato();
		System.out.println("insira o nome: \n");
		c1.setNome(ler.nextLine());
		System.out.println("insira o email: \n");
		c1.setEmail(ler.nextLine());
		System.out.println("insira o endereço: \n");
		c1.setEndereco(ler.nextLine());
		ler.close();
		ContatoDao cdao;
		try {
			cdao = new ContatoDao();
			cdao.adiciona(c1);
			System.out.println("Gravação feita com sucesso!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

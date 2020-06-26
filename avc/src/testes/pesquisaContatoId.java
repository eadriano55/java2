package testes;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class pesquisaContatoId {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Qual o ID para pesquisa?\n ");
		Long id = ler.nextLong();
		try {
			ContatoDao cdao = new ContatoDao();
			List<Contato> contatos = cdao.pesquisaId(id);
			
			for (Contato contato:contatos) {
				System.out.println("Nome: "+contato.getNome()+"\nEmail: "+contato.getEmail()+ "\nEndereco: "+contato.getEndereco());
				System.out.println("-");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		ler.close();
	}
}

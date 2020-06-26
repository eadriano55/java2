package testes;

import java.util.List;
import java.util.Scanner;

import dao.ContatoDao;
import modelo.Contato;

public class alteraContato {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Contato contato = new Contato();

		System.out.println("Digite o id do usuario a ser alterado: ");
		Long id = Long.parseLong(sc.nextLine());
		//Long id = sc.nextLong();
		
		try {
			ContatoDao contatoDao = new ContatoDao();
			List<Contato> contatos = contatoDao.pesquisaId(id);
			for (Contato nomeContato : contatos) {
				System.out.println("Nome: " + nomeContato.getNome() + " \nEmail: " + nomeContato.getEmail()
						+ " \nEndereço: " + nomeContato.getEndereco());
				System.out.println("-");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Digite o novo nome: ");
		String nome = sc.nextLine();

		System.out.println("Digite o novo email: ");
		String email = sc.nextLine();

		System.out.println("Digite o novo endereço: ");
		String endereco = sc.nextLine();

		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);

		try {
			ContatoDao contatoDao = new ContatoDao();
			contatoDao.alteraContato(contato, id);
			System.out.println("Alteração do contato feito com sucesso!\n");

			List<Contato> contatos = contatoDao.getLista();
			for (Contato nomeContato : contatos) {
				System.out.println("Nome: " + nomeContato.getNome() + " \nEmail: " + nomeContato.getEmail()
						+ " \nEndereço: " + nomeContato.getEndereco());
				System.out.println("-");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}

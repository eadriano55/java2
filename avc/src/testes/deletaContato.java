package testes;

import java.util.Scanner;

import dao.ContatoDao;

public class deletaContato {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o id do usuario a ser deletado: ");
		
		Long id = Long.parseLong(sc.nextLine());
		
		try {
			ContatoDao contatoDao;
			contatoDao = new ContatoDao();
			contatoDao.deletar(id);
			System.out.println("Contato excluido com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		sc.close();
	}
}

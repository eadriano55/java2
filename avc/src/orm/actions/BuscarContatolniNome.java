package orm.actions;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Contato;

public class BuscarContatolniNome {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();

		Scanner ini = new Scanner(System.in);
		System.out.println("Qual a primeira letra do nome a ser pesquisado?\n ");

		String inicialNome = ini.nextLine();

		List<Contato> contatos = manager
				.createQuery("select c from Contato as c where nome like '" + inicialNome + "%'", Contato.class)
				.getResultList();

		for (Contato contato : contatos) {
			System.out.println(contato.getNome());
		}
		manager.close();
		ini.close();
	}
}

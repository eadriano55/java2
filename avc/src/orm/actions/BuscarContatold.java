package orm.actions;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Contato;

public class BuscarContatold {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();

		Scanner ini = new Scanner(System.in);
		System.out.println("Qual o ID a ser pesquisado?\n ");
		Long id = ini.nextLong();

				
		Contato c1 = manager.find(Contato.class, id);
		System.out.println(c1.getId() + " - " + c1.getNome());
		
		manager.close();
		ini.close();
	}

}

package orm.actions;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import orm.modelo.Contato;

public class RemoverContato {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		Scanner c = new Scanner(System.in);
		System.out.println("digite o id a ser removido:\n ");
		Long id = c.nextLong();
		
		Contato contato = manager.find(Contato.class, id);
		
		manager.getTransaction().begin();
		manager.remove(contato);
		manager.getTransaction().commit();
		
		System.out.println("Contato excluido!");
		
		manager.close();
		c.close();
	}

}

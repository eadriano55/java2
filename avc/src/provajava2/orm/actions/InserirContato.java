package provajava2.orm.actions;


import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import provajava2.orm.modelo.Contato;

public class InserirContato {
	public static void main(String[] args) {
		
	Scanner c = new Scanner(System.in);
	
	System.out.println("digite o nome:\n ");
	String nome = c.nextLine();
	System.out.println("digite o e-mail:\n ");
	String email = c.nextLine();
	System.out.println("digite o endereco:\n ");
	String endereco = c.nextLine();
	
	Contato contato = new Contato();
	contato.setNome(nome);
	contato.setEmail(email);
	contato.setEndereco(endereco);
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
	EntityManager manager = factory.createEntityManager();
	
	manager.getTransaction().begin();
	manager.persist(contato);
	manager.getTransaction().commit();
	
	System.out.println("Contato inserido, ID: "+contato.getId());
	manager.close();
	c.close();
	}
}	

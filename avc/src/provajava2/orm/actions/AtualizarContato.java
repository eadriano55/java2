package provajava2.orm.actions;

import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import provajava2.orm.modelo.Contato;

public class AtualizarContato {
	public static void main(String[] args) {
		Scanner atual = new Scanner(System.in);
		
		System.out.println("digite o id a ser atualizado:\n ");
		Long id = Long.parseLong(atual.nextLine());
		System.out.println("digite o nome a ser atualizado:\n ");
		String nome = atual.nextLine();
		System.out.println("digite o e-mail a ser atualizado:\n ");
		String email = atual.nextLine();
		System.out.println("digite o endereco a ser atualizado:\n ");
		String endereco = atual.nextLine();
		
		Contato contato = new Contato();
		contato.setId(id);
		contato.setNome(nome);
		contato.setEmail(email);
		contato.setEndereco(endereco);
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		manager.merge(contato);
		manager.getTransaction().commit();
		
		System.out.println("Contato atualizado, ID: "+contato.getId());
		
		manager.close();
		atual.close();
	}
}

package provajava2.orm.actions;

import java.util.List;
import java.util.Scanner;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import provajava2.orm.modelo.Contato;

public class BuscarContatoInicialNome {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();

		Scanner ini = new Scanner(System.in);
		System.out.println("Qual a primeira letra para pesquisa?\n ");
		char inicialNome = ini.next().charAt(0);
		
		String sql = "select * from contatos where nome like '" + inicialNome + "%'";

		Query query = manager.createQuery(sql);
	
		@SuppressWarnings("unchecked")
		List<Contato> lista = query.getResultList();

		for (Contato c : lista) {
			System.out.println("Nome: "+c.getNome()+"\nEmail: "+c.getEmail()+ "\nEndereco: "+c.getEndereco());
			System.out.println("-");
		}
		manager.close();
		ini.close();
	}

}

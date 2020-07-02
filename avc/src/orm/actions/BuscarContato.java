package orm.actions;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import orm.modelo.Contato;

public class BuscarContato {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		EntityManager manager = factory.createEntityManager();

		String sql = "select c from Contato as c";

		Query query = manager.createQuery(sql);
	
		@SuppressWarnings("unchecked")
		List<Contato> lista = query.getResultList();

		for (Contato c : lista) {
			System.out.println(c.getNome());
		}
		manager.close();
	}

}

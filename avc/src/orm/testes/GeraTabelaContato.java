package orm.testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelaContato {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("contatos");
		factory.close();
	}
}

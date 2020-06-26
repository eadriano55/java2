package orm.actions;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import orm.modelo.Tarefa;

public class RemoverTarefa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("tarefas");
		EntityManager manager = factory.createEntityManager();
		
		Tarefa tarefa3 = manager.find(Tarefa.class, 1L);
		
		manager.getTransaction().begin();
		manager.remove(tarefa3);
		manager.getTransaction().commit();
		
		System.out.println("Tarefa excluida!");
		
		manager.close();
		
	}

}

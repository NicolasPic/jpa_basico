package programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Main {

	public static void main(String[] args) {
		/*inserção
		Pessoa p1 = new Pessoa(null,"Carlos","carlos@gmail.com");
		Pessoa p2 = new Pessoa(null,"Nicolas","nicolass@gmail.com");
		Pessoa p3 = new Pessoa(null,"Joaquin","joaquin@gmail.com");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		*/
		
		/* pesquisa/remocao
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		//pesquisa
		Pessoa p = em.find(Pessoa.class, 2);
		//
		
		//remocao
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		
		System.out.println("Pronto");
		em.close();
		emf.close();
		 */
	}

}

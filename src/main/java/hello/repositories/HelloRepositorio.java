package hello.repositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import hello.domain.Hello;

public class HelloRepositorio  {
	public void salvar(Hello entidade) {
		System.out.println("1R");
		EntityTransaction transacao = null;
		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;
		try {
			System.out.println("2R");
			entityManagerFactory = Persistence.createEntityManagerFactory("hellopersistencia");
			System.out.println("3R");
			entityManager = entityManagerFactory.createEntityManager();
			transacao = entityManager.getTransaction();
			transacao.begin();
			entityManager.persist(entidade);
			transacao.commit();			 

		} catch (RuntimeException e) {
			System.out.println("GerericRepository.salvar" + e.toString());
			// TODO: handle exception
			if (transacao != null)
				transacao.rollback();
			throw e;
		} finally {
			// sessao.close();
			if (entityManager != null) {
				entityManager.close();
				entityManagerFactory.close();
			}
		} 
	}

}

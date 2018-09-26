package up.edu.br.inventarioresidencial.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import up.edu.br.inventarioresidencial.entidades.Local;

public class LocalDao implements Dao<Local> {

	@Override
	public void adicionar(Local local) {
		EntityManager em = Conexao.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.persist(local);
		em.getTransaction().commit();
		
		
	}

	@Override
	public void editar(Local local) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.merge(local);
		em.getTransaction().commit();
		
	}

	@Override
	public void excluir(Local local) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.remove(local);
		em.getTransaction().commit();
		
	}

	@Override
	public List<Local> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Query q = em.createQuery("select a from Local a");
		return q.getResultList();

	}

	@Override
	public Local buscarPorId(Long id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		return em.find(Local.class, id);
	}
 
}

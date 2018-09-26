package up.edu.br.inventarioresidencial.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import up.edu.br.inventarioresidencial.entidades.Item;

public class ItemDao implements Dao<Item> {

	
	public void adicionar(Item item) {
		EntityManager em = Conexao.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.persist(item);
		em.merge(item);
		em.getTransaction().commit();
		
	}

	@Override
	public void editar(Item item) {
		
		try {
			EntityManager em = Conexao.getInstance().createEntityManager();
			em.getTransaction().begin();
			em.merge(item);
			em.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage().toString();
		}
		
		
		
		
	}

	@Override
	public void excluir(Item item) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.remove(item);
		em.getTransaction().commit();
		
	}

	@Override
	public List<Item> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Query q = em.createQuery("select a from Item a");
		return q.getResultList();
	
	}

	@Override
	public Item buscarPorId(Long id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		return em.find(Item.class, id);
	}

}

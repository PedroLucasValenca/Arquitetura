package up.edu.br.inventarioresidencial.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import up.edu.br.inventarioresidencial.entidades.TipoDeUso;

public class TipoDeUsoDao implements Dao<TipoDeUso> {

	@Override
	public void adicionar(TipoDeUso tipoDeUso) {
		EntityManager em = Conexao.getInstance().createEntityManager();		
		em.getTransaction().begin();
		em.persist(tipoDeUso);
		em.getTransaction().commit();
		
	}

	@Override
	public void editar(TipoDeUso tipoDeUso) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.merge(tipoDeUso);
		em.getTransaction().commit();
		
	}

	@Override
	public void excluir(TipoDeUso tipoDeUso) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.remove(tipoDeUso);
		em.getTransaction().commit();
		
	}

	@Override
	public List<TipoDeUso> listar() {
		EntityManager em = Conexao.getInstance().createEntityManager();
		Query q = em.createQuery("select a from TipoDeUso a");
		return q.getResultList();
	}

	@Override
	public TipoDeUso buscarPorId(Long id) {
		EntityManager em = Conexao.getInstance().createEntityManager();
		return em.find(TipoDeUso.class, id);
		
	}

}

package up.edu.br.inventarioresidencial.teste;

import javax.persistence.EntityManager;

import up.edu.br.inventarioresidencial.dao.Conexao;
import up.edu.br.inventarioresidencial.entidades.Item;

public class testarConexao {

	public static void main(String[] args) {
		Item it = new Item();

		it.setNomeItem("CAMA");
		it.setQuantidade(1);
		// it.setDataArmazenamento(dataArmazenamento);
		it.setLocal("locall");
		it.setTipoDeUso(null);
		EntityManager em = Conexao.getInstance().createEntityManager();
		em.getTransaction().begin();
		em.persist(it);
		em.getTransaction().commit();

	}

}

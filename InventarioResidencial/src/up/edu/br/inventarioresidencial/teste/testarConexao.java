package up.edu.br.inventarioresidencial.teste;

import javax.persistence.EntityManager;

import up.edu.br.inventarioresidencial.dao.Conexao;
import up.edu.br.inventarioresidencial.entidades.Item;
import up.edu.br.inventarioresidencial.entidades.Local;
import up.edu.br.inventarioresidencial.entidades.TipoDeUso;

public class testarConexao {

	public static void main(String[] args) {
		Item it = new Item();

		it.setNomeItem("CAMA");
		it.setQuantidade(1);
		// it.setDataArmazenamento(dataArmazenamento);
		//it.setLocal("locall");
		//it.setTipoDeUso(null);
		

		
	
	}

}

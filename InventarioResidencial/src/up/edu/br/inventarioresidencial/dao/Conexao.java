package up.edu.br.inventarioresidencial.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

	private static EntityManagerFactory emf = Persistence.
			createEntityManagerFactory("inventarioresidencial");
	
	
	public static EntityManagerFactory getInstance() {
		return emf;
}
}

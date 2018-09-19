package up.edu.br.inventarioresidencial.dao;

import up.edu.br.inventarioresidencial.entidades.Item;
import up.edu.br.inventarioresidencial.entidades.Local;
import up.edu.br.inventarioresidencial.entidades.TipoDeUso;

public class FabricaDao {
	
	public static Dao<Item> createDaoItem() {
		return new ItemDao();
	}
	
	public static Dao<Local> createDaoLocal() {
		return new LocalDao();
	}
	
	public static Dao<TipoDeUso> createDaoTipoDeUso() {
		return new TipoDeUsoDao();
	}

}

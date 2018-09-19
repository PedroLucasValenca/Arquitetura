package up.edu.br.invetarioresidencial.servico;

import up.edu.br.inventarioresidencial.dao.Dao;
import up.edu.br.inventarioresidencial.dao.FabricaDao;
import up.edu.br.inventarioresidencial.entidades.Item;

public class ItemServico {
	
	public void adicionar(Item item) throws ServicoException {
		if (item.getNomeItem() == null) {
			throw new ServicoException("O campo Nome "
					+ "não pode ser vazio.");
		}
		if (item.getQuantidade() < 0) {
			throw new ServicoException("O campo Quantidade " + "não pode ser vazio");
			
		}
		
		Dao<Item> itemDao = FabricaDao.createDaoItem();
		itemDao.adicionar(item);
	}

	public void excluir(Item item) {
		Dao<Item> itemDao = FabricaDao.createDaoItem();
		itemDao.excluir(item);
	}
}

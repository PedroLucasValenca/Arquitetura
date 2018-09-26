package up.edu.br.invetarioresidencial.servico;

import up.edu.br.inventarioresidencial.dao.Dao;
import up.edu.br.inventarioresidencial.dao.FabricaDao;
import up.edu.br.inventarioresidencial.entidades.Local;

public class LocalServico {

	public void adicionar(Local local) throws ServicoException {
		if (local.getNomeLocacao() == null) {
			throw new ServicoException("O campo Nome " + "não pode ser vazio.");
		}

		Dao<Local> localDao = FabricaDao.createDaoLocal();
		localDao.adicionar(local);
	}

	public void excluir(Local local) {
		Dao<Local> localDao = FabricaDao.createDaoLocal();
		localDao.excluir(local);
	}

	public void editar(Local local) {
		Dao<Local> localDao = FabricaDao.createDaoLocal();
		localDao.editar(local);
	}

}

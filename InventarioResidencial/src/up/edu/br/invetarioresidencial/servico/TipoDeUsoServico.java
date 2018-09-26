package up.edu.br.invetarioresidencial.servico;

import up.edu.br.inventarioresidencial.dao.Dao;
import up.edu.br.inventarioresidencial.dao.FabricaDao;
import up.edu.br.inventarioresidencial.entidades.TipoDeUso;

public class TipoDeUsoServico {

	public void adicionar(TipoDeUso tipoDeUso) throws ServicoException {
		if (tipoDeUso.getNomeTipoDeUso() == null) {
			throw new ServicoException("O campo Nome Tipo de Uso " + "não pode ser vazio.");
		}
		if (tipoDeUso.getAplicacao() == null) {
			throw new ServicoException("O campo Aplicação" + "não pode ser vazio.");

		}

		Dao<TipoDeUso> tipoDeUsoDao = FabricaDao.createDaoTipoDeUso();
		tipoDeUsoDao.adicionar(tipoDeUso);
	}

	public void excluir(TipoDeUso tipoDeUso) {
		Dao<TipoDeUso> tipoDeUsoDao = FabricaDao.createDaoTipoDeUso();
		tipoDeUsoDao.excluir(tipoDeUso);
	}

	public void editar(TipoDeUso tipoDeUso) {
		Dao<TipoDeUso> tipoDeUsoDao = FabricaDao.createDaoTipoDeUso();
		tipoDeUsoDao.editar(tipoDeUso);
	}
}

package up.edu.br.inventarioresidencial.teste;

import org.junit.jupiter.api.Test;

import up.edu.br.inventarioresidencial.entidades.TipoDeUso;
import up.edu.br.invetarioresidencial.servico.ServicoException;
import up.edu.br.invetarioresidencial.servico.TipoDeUsoServico;


public class TestarTipoDeUso {
	
	@Test
	public void adicionarTipoDeUso() {
		TipoDeUso tipoUso = new TipoDeUso();
		
		tipoUso.setNomeTipoDeUso("Residencial");
		tipoUso.setDescricao("Para uso somente residencial");
		tipoUso.setAplicacao("Interno");
		
		
		try {
			new TipoDeUsoServico().adicionar(tipoUso);
		} catch (ServicoException e) {
			e.printStackTrace();
		}
	}

}

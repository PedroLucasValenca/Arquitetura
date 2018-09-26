package up.edu.br.inventarioresidencial.teste;

import org.junit.jupiter.api.Test;

import up.edu.br.inventarioresidencial.entidades.Local;
import up.edu.br.invetarioresidencial.servico.LocalServico;
import up.edu.br.invetarioresidencial.servico.ServicoException;

public class TestarLocal {

	@Test
	public void adicionarLocal() {
		Local loc = new Local();
		
		loc.setNomeLocacao("Quarto");
		loc.setDescricao("Casal");
		
		try {
			new LocalServico().adicionar(loc);
		} catch (ServicoException e) {
			e.printStackTrace();
		}
	}
}

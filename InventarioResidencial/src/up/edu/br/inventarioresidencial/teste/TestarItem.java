package up.edu.br.inventarioresidencial.teste;

import org.junit.jupiter.api.Test;

import up.edu.br.inventarioresidencial.entidades.Item;
import up.edu.br.invetarioresidencial.servico.ItemServico;
import up.edu.br.invetarioresidencial.servico.ServicoException;

public class TestarItem {

	@Test
	public void cadastrarItem() {
		Item it = new Item();

		it.setNomeItem("CAMA");
		it.setQuantidade(1);
		// it.setDataArmazenamento(dataArmazenamento);
		it.setLocal("locall");
		it.setTipoDeUso(null);

		try {
			new ItemServico().adicionar(it);
		} catch (ServicoException e) {
			e.printStackTrace();
		}
	}
}

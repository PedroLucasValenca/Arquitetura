package up.edu.br.inventarioresidencial.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import io.swagger.annotations.Api;
import up.edu.br.inventarioresidencial.dao.ItemDao;
import up.edu.br.inventarioresidencial.entidades.Item;
import up.edu.br.invetarioresidencial.servico.ItemServico;
import up.edu.br.invetarioresidencial.servico.ServicoException;


@Path("/itemrest")
@Api(value="/itemrest")
public class ItemRest {
	
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void adicionar(Item item) {		
		try {
			new ItemServico().adicionar(item);
		} catch (ServicoException e) {
			e.printStackTrace();
		}		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Item> listar() {
		List<Item> itens = new ItemDao().listar();
		return itens;
		
		}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void delete(Item item) {
		try {
			new ItemServico().excluir(item);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
}
	

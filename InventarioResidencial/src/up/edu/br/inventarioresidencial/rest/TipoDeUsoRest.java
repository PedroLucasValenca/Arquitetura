package up.edu.br.inventarioresidencial.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import up.edu.br.inventarioresidencial.dao.TipoDeUsoDao;
import up.edu.br.inventarioresidencial.entidades.TipoDeUso;
import up.edu.br.invetarioresidencial.servico.ServicoException;
import up.edu.br.invetarioresidencial.servico.TipoDeUsoServico;

@Path("/tipodeusorest")
@Api(value="/tipodeusorest")
public class TipoDeUsoRest {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void adicionar(TipoDeUso tipoDeUso) {		
		try {
			new TipoDeUsoServico().adicionar(tipoDeUso);
		} catch (ServicoException e) {
			e.printStackTrace();
		}		
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<TipoDeUso> listar() {
		List<TipoDeUso> tiposDeUso = new TipoDeUsoDao().listar();
		return tiposDeUso;
		
		}
	
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void delete(TipoDeUso tipoDeUso) {
		try {
			new TipoDeUsoServico().excluir(tipoDeUso);
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void editar(TipoDeUso tipoDeUso) {
		
		new TipoDeUsoServico().editar(tipoDeUso);
	}
	
	@GET
	@Path("{id}")
	public Response buscar(@PathParam("id") Long id)
	{
		TipoDeUso tipoDeUso = new TipoDeUsoDao().buscarPorId(id);
		if(tipoDeUso == null)
		{
			return Response.status(Response.Status.NOT_FOUND).entity("Tipo de Uso n�o encontrado").build();
		}
		return Response.ok(tipoDeUso).build();
	}

}

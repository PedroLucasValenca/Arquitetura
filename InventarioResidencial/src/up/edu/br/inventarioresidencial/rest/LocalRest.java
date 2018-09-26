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
import up.edu.br.inventarioresidencial.dao.LocalDao;
import up.edu.br.inventarioresidencial.entidades.Local;
import up.edu.br.invetarioresidencial.servico.LocalServico;
import up.edu.br.invetarioresidencial.servico.ServicoException;

@Path("/localrest")
@Api(value = "/localrest")
public class LocalRest {

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void adicionar(Local local) {
		try {
			new LocalServico().adicionar(local);
		} catch (ServicoException e) {
			e.printStackTrace();
		}
	}

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Local> listar() {
		List<Local> locais = new LocalDao().listar();
		return locais;

	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void delete(Local local) {
		try {
			new LocalServico().excluir(local);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public void editar(Local local) {
		try {
			new LocalServico().editar(local);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@GET
	@Path("{id}")
	public Response buscar(@PathParam("id") Long id) {
		Local local = new LocalDao().buscarPorId(id);
		if (local == null) {
			return Response.status(Response.Status.NOT_FOUND).entity("Local não encontrado").build();
		}
		return Response.ok(local).build();
	}
}

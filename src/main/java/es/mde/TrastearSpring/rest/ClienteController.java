package es.mde.TrastearSpring.rest;

import java.util.List;

import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.mde.TrastearSpring.entidades.Cliente;
import es.mde.TrastearSpring.repositorios.ClienteDAO;

@RepositoryRestController
@RequestMapping(path = "/clientes/search")
public class ClienteController {
	private ClienteDAO clienteDAO;

	public ClienteController(ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}

	@GetMapping("/get-vip")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> getClientesConFechaPosterior(
			PersistentEntityResourceAssembler assembler) {

		List<Cliente> clientes = clienteDAO.getClientesVip();

		return assembler.toCollectionModel(clientes);
	}

}

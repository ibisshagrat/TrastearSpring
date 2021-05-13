package es.mde.TrastearSpring.rest;

import java.util.List;

import org.springframework.data.rest.webmvc.PersistentEntityResource;
import org.springframework.data.rest.webmvc.PersistentEntityResourceAssembler;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.hateoas.CollectionModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import es.mde.TrastearSpring.entidades.ClienteVIP;
import es.mde.TrastearSpring.repositorios.ClienteVipDAO;

@RepositoryRestController
@RequestMapping(path = "/clientes/search")
public class ClienteController {
	
	private ClienteVipDAO clienteDAO;
	
	ClienteController(ClienteVipDAO clienteDAO){
		this.clienteDAO = clienteDAO;
	}
	
	@GetMapping("/es-muy-vip")
	@ResponseBody
	public CollectionModel<PersistentEntityResource> getClienteMuyVIP(
			PersistentEntityResourceAssembler assembler) {
		
		List<ClienteVIP> clientes = clienteDAO.getClienteMuyVIP();
		
		return assembler.toCollectionModel(clientes);
	}

}

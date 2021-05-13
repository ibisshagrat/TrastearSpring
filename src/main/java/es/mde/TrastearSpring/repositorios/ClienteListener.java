package es.mde.TrastearSpring.repositorios;

import javax.persistence.PrePersist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.mde.TrastearSpring.entidades.ClienteVIP;

@Component
public class ClienteListener {

	private ClienteDAO clienteDAO;
	
	@Autowired
	public void init (ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}
	
	@PrePersist
	public void preguardarCliente(ClienteVIP cliente) {
		System.err.println("Voy a guardar el cliente: " + cliente.getNombre());
	}
	
}

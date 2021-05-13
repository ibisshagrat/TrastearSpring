package es.mde.TrastearSpring.repositorios;

import javax.persistence.PrePersist;
import javax.persistence.PreRemove;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.mde.TrastearSpring.entidades.Cliente;

@Component
public class ClienteListener {

	@SuppressWarnings("unused")
	private ClienteDAO clienteDAO;
	
	@Autowired
	public void init (ClienteDAO clienteDAO) {
		this.clienteDAO = clienteDAO;
	}
	
	@PrePersist
	public void preguardarCliente(Cliente cliente) {
		System.err.println("Voy a guardar el cliente: " + cliente.getNombre());
	}
	
	@PreRemove
	public void preBorrar(Cliente cliente) {
		System.err.println("Va a borrar el cliente: " + cliente.getNombre());
	}
	
}

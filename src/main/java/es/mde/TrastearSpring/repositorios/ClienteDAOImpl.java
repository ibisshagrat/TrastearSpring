package es.mde.TrastearSpring.repositorios;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import es.mde.TrastearSpring.entidades.Cliente;

@Transactional(readOnly = true)
public class ClienteDAOImpl implements ClienteDAOCustom{

	@Autowired
	ClienteDAO clienteDAO;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Cliente> getClientesVip() {
		List<Cliente> clientes = clienteDAO.findAll().stream()
				.filter(c -> c.isVip())
				.collect(Collectors.toList());
		return clientes;
	}
	
}

package es.mde.TrastearSpring.repositorios;

import java.util.List;
import java.util.stream.Collectors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import es.mde.TrastearSpring.entidades.ClienteVIP;

@Transactional(readOnly = true)
public class ClienteVipDaoImpl implements ClienteVipDAOCustom{

	@Autowired
	ClienteVipDAO clienteDAO;
	
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<ClienteVIP> getClienteMuyVIP() {
		List<ClienteVIP> clientes = clienteDAO.findAll().stream()
				.filter(c -> c.isEsSuperVip())
				.collect(Collectors.toList());	
		return clientes;
	}

}

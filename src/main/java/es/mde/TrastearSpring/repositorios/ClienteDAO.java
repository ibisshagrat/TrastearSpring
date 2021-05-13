package es.mde.TrastearSpring.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import es.mde.TrastearSpring.entidades.ClienteVIP;

@RepositoryRestResource(path = "clientes", itemResourceRel = "cliente", collectionResourceRel = "clientes")
public interface ClienteDAO extends JpaRepository<ClienteVIP, Long>{

	@RestResource(path="buscar")
	List<ClienteVIP> findByNombre(String nombre);

}
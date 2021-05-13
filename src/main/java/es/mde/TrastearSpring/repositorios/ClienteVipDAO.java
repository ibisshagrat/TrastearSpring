package es.mde.TrastearSpring.repositorios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import es.mde.TrastearSpring.entidades.ClienteVIP;

@RepositoryRestResource(path = "clientes", itemResourceRel = "cliente", collectionResourceRel = "clientes")
public interface ClienteVipDAO extends JpaRepository<ClienteVIP, Long>, ClienteVipDAOCustom{

	@RestResource(path="buscar")
	List<ClienteVIP> findByNombreContaining(@Param("nombre") String nombre);

	
}
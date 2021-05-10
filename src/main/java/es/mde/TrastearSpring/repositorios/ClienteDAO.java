package es.mde.TrastearSpring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.TrastearSpring.entidades.ClienteVIP;

@RepositoryRestResource(path = "clientes", itemResourceRel = "cliente", collectionResourceRel = "clientes")
public interface ClienteDAO extends JpaRepository<ClienteVIP, Long>{

}
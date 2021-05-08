package es.mde.TrastearSpring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.TrastearSpring.entidades.Cliente;

@RepositoryRestResource
public interface ClienteDAO extends JpaRepository<Cliente, Long>{

}

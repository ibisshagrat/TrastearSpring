package es.mde.TrastearSpring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import es.mde.TrastearSpring.entidades.Pedido;

@RepositoryRestResource
public interface PedidoDAO extends JpaRepository<Pedido, Long>{

}

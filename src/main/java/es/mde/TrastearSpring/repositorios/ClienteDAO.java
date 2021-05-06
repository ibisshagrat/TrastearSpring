package es.mde.TrastearSpring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import es.mde.TrastearSpring.entidades.Cliente;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteDAO extends JpaRepository<Cliente, Long> {

}

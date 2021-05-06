package es.mde.TrastearSpring.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.mde.TrastearSpring.entidades.ClienteVIP;

@Repository
public interface ClienteVipDAO extends JpaRepository<ClienteVIP, Long>{

}

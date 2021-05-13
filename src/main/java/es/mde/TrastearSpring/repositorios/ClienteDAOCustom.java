package es.mde.TrastearSpring.repositorios;

import java.util.List;

import es.mde.TrastearSpring.entidades.Cliente;

public interface ClienteDAOCustom {

	List <Cliente> getClientesVip();
}

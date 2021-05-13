
package es.mde.TrastearSpring.entidades;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import es.mde.TrastearSpring.repositorios.ClienteListener;

@Entity
@EntityListeners(ClienteListener.class)
@Table(name = "CLIENTESVIP")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class ClienteVIP extends Cliente {
	
	
	private boolean esSuperVip;
	
	public ClienteVIP () {
		
	}
	
	public ClienteVIP (String nombre, boolean esSuperVip) {
		super();
		super.setNombre(nombre);
		this.esSuperVip =  esSuperVip;
	}


	public boolean isEsSuperVip() {
		return esSuperVip;
	}

	public void setEsSuperVip(boolean esSuperVip) {
		this.esSuperVip = esSuperVip;
	}

	@Override
	public String toString() {
		return "ClienteVIP [id =" + super.getId()  + " nombre y apellidos " + super.getNombre() + "esSuperVip=" + esSuperVip + "]";
	}
	
	
	
	
}

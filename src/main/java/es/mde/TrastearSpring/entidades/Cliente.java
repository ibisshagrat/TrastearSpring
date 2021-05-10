package es.mde.TrastearSpring.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;
import javax.persistence.OneToMany;


@MappedSuperclass
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private long id;
	@Column(name = "Nombre_Apellidos")
	private String nombre;
	private transient String datoIrrelevanteA;
	private String datoIrrelevanteB;
	@OneToMany(cascade = CascadeType.MERGE, targetEntity = Pedido.class, mappedBy = "cliente")
	List<Pedido> pedidos = new ArrayList<Pedido>();
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getDatoIrrelevanteA() {
		return datoIrrelevanteA;
	}
	public void setDatoIrrelevanteA(String datoIrrelevanteA) {
		this.datoIrrelevanteA = datoIrrelevanteA;
	}
	public String getDatoIrrelevanteB() {
		return datoIrrelevanteB;
	}
	public void setDatoIrrelevanteB(String datoIrrelevanteB) {
		this.datoIrrelevanteB = datoIrrelevanteB;
	}
	
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	
	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void addPedido(Pedido pedido) {
		pedidos.add(pedido);
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nombre=" + nombre + "]";
	}
	
	public Cliente() {}
	
	public Cliente(String nombre) {
		this.nombre = nombre;
	}


	
	
}

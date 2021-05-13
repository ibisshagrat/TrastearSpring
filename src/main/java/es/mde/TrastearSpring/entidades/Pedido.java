package es.mde.TrastearSpring.entidades;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "PEDIDOS")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true)
	private long codPedido;
	private String cosas;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "CLIENTE")
	private Cliente cliente;
	
	public Pedido() {
	}
	
	public Pedido(long codPedido, String cosas, Cliente cliente) {
		super();
		this.codPedido = codPedido;
		this.cosas = cosas;
		this.cliente = cliente;
	}

	public long getCodPedido() {
		return codPedido;
	}
	public void setCodPedido(long codPedido) {
		this.codPedido = codPedido;
	}
	public String getCosas() {
		return cosas;
	}
	public void setCosas(String cosas) {
		this.cosas = cosas;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Pedido [codPedido=" + codPedido + ", cosas=" + cosas + ", cliente=" + cliente + "]";
	}
	
}

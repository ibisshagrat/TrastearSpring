package es.mde.TrastearSpring.rest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class MixIns {

	@JsonIgnoreProperties(value = { "datoIrrelevanteA", "datoIrrelevanteB" })
	public static interface Clientes {
		@JsonProperty("nombreCompleto")
		abstract String getNombre();
		@JsonProperty("id")
		abstract Long getId();

	}
	
	@JsonPropertyOrder({ "codPedido", "cosas", "cliente" })
	public static interface Pedidos {
		
	}
}

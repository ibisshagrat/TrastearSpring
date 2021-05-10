package es.mde.TrastearSpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.fasterxml.jackson.databind.ObjectMapper;

import es.mde.TrastearSpring.entidades.ClienteVIP;
import es.mde.TrastearSpring.entidades.Pedido;
import es.mde.TrastearSpring.rest.MixIns;

@Configuration
@PropertySource({ "classpath:config/rest.properties" })
public class ConfiguracionPorJava {

	@Bean
	public ObjectMapper getObjectMapper() {

		ObjectMapper mapper = new ObjectMapper();
		// Los MixIn se pueden usar y reutilizar sobre codigo que no controlo
		mapper.addMixIn(ClienteVIP.class, MixIns.Clientes.class);
		mapper.addMixIn(Pedido.class, MixIns.Pedidos.class);		
		return mapper;
	}
}

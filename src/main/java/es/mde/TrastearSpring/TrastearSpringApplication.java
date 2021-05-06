package es.mde.TrastearSpring;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import es.mde.TrastearSpring.entidades.Cliente;
import es.mde.TrastearSpring.repositorios.ClienteDAO;

import java.io.IOException;
import java.text.ParseException;

@SpringBootApplication
@ImportResource({"classpath:config/jpa-config.xml"})
public class TrastearSpringApplication {

    private static Logger log = LoggerFactory.getLogger(Cliente.class);
    
	public static void main(String[] args) throws ParseException, IOException {
		
		ConfigurableApplicationContext context =
				SpringApplication.run(TrastearSpringApplication.class, args);
		
		Cliente cliente = new Cliente(77877, "Lola");
		System.out.println(cliente.toString());		
		
		ClienteDAO clienteDAO = context.getBean(ClienteDAO.class);
		System.out.println("traza antes guardar");
		clienteDAO.save(cliente);
		List<Cliente> clientes = clienteDAO.findAll();
//		clientes.forEach(System.out::println);
		log.trace("Datos almacenados");
		clientes.stream().map(Cliente::toString).forEach(log::info);
		
		
		context.close();
	}

}

package es.mde.TrastearSpring;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;
import es.mde.TrastearSpring.entidades.Cliente;
import es.mde.TrastearSpring.entidades.Pedido;
import es.mde.TrastearSpring.repositorios.ClienteDAO;
import es.mde.TrastearSpring.repositorios.PedidoDAO;

@SpringBootApplication
@ImportResource({"classpath:config/jpa-config.xml"})
public class TrastearSpringApplication {

    private static Logger log = LoggerFactory.getLogger(Cliente.class);
    
	public static void main(String[] args) {
		
		ConfigurableApplicationContext context =
				SpringApplication.run(TrastearSpringApplication.class, args);
		
		Cliente cliente = new Cliente("Jr");
		Pedido pedido = new Pedido(1224l,"telefonos", cliente);
		cliente.addPedido(pedido);
		
		System.out.println("traza antes guardar");

		ClienteDAO clienteDAO = context.getBean(ClienteDAO.class);
		clienteDAO.save(cliente);
		System.out.println("Cliente guardado");
		
		PedidoDAO pedidoDAO = context.getBean(PedidoDAO.class);
		pedidoDAO.save(pedido);
		System.out.println("Pedido guardado");

		
		List<Cliente> clientes = clienteDAO.findAll();
		log.trace("Datos almacenados");
		clientes.stream().map(Cliente::toString).forEach(log::info);

		List<Pedido> pedidos = pedidoDAO.findAll();
		pedidos.stream().map(Pedido::toString).forEach(log::info);
		
		context.close();
	}

}

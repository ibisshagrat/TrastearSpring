package es.mde.TrastearSpring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@Import(ConfiguracionPorJava.class)
@ImportResource({"classpath:config/jpa-config.xml"})
public class TrastearSpringApplication {
    
	public static void main(String[] args) {
		
		@SuppressWarnings("unused")
		ConfigurableApplicationContext context =
				SpringApplication.run(TrastearSpringApplication.class, args);
		
	}

}

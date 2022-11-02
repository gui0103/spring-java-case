package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.entity.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBasicoApplication {

	public static void main(String[] args) {

		String teste = "     Guilherme de Carvalho Costa ";

		Cliente cliente = new Cliente(teste);

		cliente.setName(teste);

		System.out.println("Primeiro nome do Cliente: " + cliente.getName());
		System.out.println("Primeiro nome do Cliente: " + cliente.getFirstName());

		SpringApplication.run(JavaBasicoApplication.class, args);
	}

}

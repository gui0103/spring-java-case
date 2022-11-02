package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.entity.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBasicoApplication {

	public static void main(String[] args) {

		String teste = "     Guilherme de Carvalho Costa ";

		String teste2 = "     Guilherme Carvalho Costa ";

		Cliente cliente = new Cliente(teste);

		cliente.setName(teste);

		System.out.println("Nome completo do Cliente: " + cliente.getName());
		System.out.println("Primeiro nome do Cliente: " + cliente.getFirstName());
		System.out.println("Sobrenome(s) do Cliente: " + cliente.getLastNames());
		System.out.println("Nome completo do Cliente em letra maiúscula: " + cliente.getUpperCasedName());
		System.out.println("Nome completo do Cliente abreviado: " + cliente.getShortName());
		System.out.println("\n \n \n \n \n");

		Cliente cliente2 = new Cliente(teste2);

		cliente2.setName(teste2);

		System.out.println("Nome completo do Cliente: " + cliente2.getName());
		System.out.println("Primeiro nome do Cliente: " + cliente2.getFirstName());
		System.out.println("Sobrenome(s) do Cliente: " + cliente2.getLastNames());
		System.out.println("Nome completo do Cliente em letra maiúscula: " + cliente2.getUpperCasedName());
		System.out.println("Nome completo do Cliente abreviado: " + cliente2.getShortName());

		SpringApplication.run(JavaBasicoApplication.class, args);
	}

}

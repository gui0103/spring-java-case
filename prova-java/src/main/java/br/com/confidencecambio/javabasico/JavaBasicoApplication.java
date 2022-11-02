package br.com.confidencecambio.javabasico;

import br.com.confidencecambio.javabasico.entity.Cliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaBasicoApplication {

	public static void main(String[] args) {

		// Deixei as Strings com espaços para o teste de remover espaços em branco
		// do começo e fim

		String name = "     Guilherme de Carvalho Costa ";

		String name2 = "     João Soares Silva ";

		Cliente cliente = new Cliente(name);

		cliente.setName(name);

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Nome completo do Cliente: " + cliente.getName());
		System.out.println("Primeiro nome do Cliente: " + cliente.getFirstName());
		System.out.println("Sobrenome(s) do Cliente: " + cliente.getLastNames());
		System.out.println("Nome completo do Cliente em letra maiuscula: " + cliente.getUpperCasedName());
		System.out.println("Nome completo do Cliente abreviado: " + cliente.getShortName());
		System.out.println("----------------------------------------------------------------------------------\n");

		Cliente cliente2 = new Cliente(name2);

		cliente2.setName(name2);

		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Nome completo do Cliente: " + cliente2.getName());
		System.out.println("Primeiro nome do Cliente: " + cliente2.getFirstName());
		System.out.println("Sobrenome(s) do Cliente: " + cliente2.getLastNames());
		System.out.println("Nome completo do Cliente em letra maiuscula: " + cliente2.getUpperCasedName());
		System.out.println("Nome completo do Cliente abreviado: " + cliente2.getShortName());
		System.out.println("----------------------------------------------------------------------------------\n");

		SpringApplication.run(JavaBasicoApplication.class, args);
	}

}

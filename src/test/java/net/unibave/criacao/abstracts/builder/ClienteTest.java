package net.unibave.criacao.abstracts.builder;

import org.junit.Assert;
import org.junit.Test;

public class ClienteTest {

	@Test
	public void deveMontarContatoInternet() {
		Cliente cliente = Cliente.Builder.newInstance().nome("Rodrigo").email("seco.rodrigo@gmail.com").build();
		Assert.assertEquals(" nome: Rodrigo email: seco.rodrigo@gmail.com", cliente.toString());
	}
	
	@Test
	public void deveMontarContatoTelefone() {
		Cliente cliente = Cliente.Builder.newInstance().nome("Rodrigo").telefone("9999-9999").build();
		Assert.assertEquals(" nome: Rodrigo telefone: 9999-9999", cliente.toString());
	}
	
	@Test
	public void deveMontarContatoCompleto() {
		Cliente cliente = Cliente.Builder.newInstance().nome("Rodrigo").endereco("Rua joao").telefone("9999-9999").email("seco.rodrigo@gmail.com").build();
		Assert.assertEquals(" nome: Rodrigo endereco: Rua joao telefone: 9999-9999 email: seco.rodrigo@gmail.com", cliente.toString());
	}
}

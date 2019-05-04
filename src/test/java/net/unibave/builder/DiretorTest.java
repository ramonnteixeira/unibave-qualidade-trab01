package net.unibave.builder;

import net.unibave.builder.Diretor;
import org.junit.Assert;
import org.junit.Test;

public class DiretorTest {

	@Test
	public void deveMontarContatoInternet() {
		Diretor cliente = Diretor.Builder.newInstance().nome("Rodrigo").email("seco.rodrigo@gmail.com").build();
		Assert.assertEquals(" nome: Rodrigo email: seco.rodrigo@gmail.com", cliente.toString());
	}
	
	@Test
	public void deveMontarContatoTelefone() {
		Diretor cliente = Diretor.Builder.newInstance().nome("Rodrigo").telefone("9999-9999").build();
		Assert.assertEquals(" nome: Rodrigo telefone: 9999-9999", cliente.toString());
	}
	
	@Test
	public void deveMontarContatoCompleto() {
		Diretor cliente = Diretor.Builder.newInstance().nome("Rodrigo").endereco("Rua joao").telefone("9999-9999").email("seco.rodrigo@gmail.com").build();
		Assert.assertEquals(" nome: Rodrigo endereco: Rua joao telefone: 9999-9999 email: seco.rodrigo@gmail.com", cliente.toString());
	}
}

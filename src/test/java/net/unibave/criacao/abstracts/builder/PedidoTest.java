package net.unibave.criacao.abstracts.builder;

import org.junit.Test;

import org.junit.Assert;

public class PedidoTest {

	@Test
	public void deveMontarListaDePedidoBuilder() {
		Pedido pedido = Pedido.Builder.newInstance().sanduiche().batata().brinquedo().refrigerante().build();
		String resultadoEsperado = "Sanduiche: true - Batata: true - Brinquedo: true - Refrigerante: true";
		Assert.assertEquals(resultadoEsperado, pedido.toString());
	}
}

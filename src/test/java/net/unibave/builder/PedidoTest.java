package net.unibave.builder;

import net.unibave.builder.Pedido;
import org.junit.Test;

import org.junit.Assert;

public class PedidoTest {

	@Test
	public void deveMontarListaDePedidoBuilder() {
		Pedido pedido = Pedido.builder().newInstance().sanduiche().batata().brinquedo().refrigerante().build();
		String resultadoEsperado = "Sanduiche: true - Batata: true - Brinquedo: true - Refrigerante: true";
		Assert.assertEquals(resultadoEsperado, pedido.toString());
	}
}

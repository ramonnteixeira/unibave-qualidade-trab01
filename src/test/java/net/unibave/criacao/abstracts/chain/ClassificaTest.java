package net.unibave.criacao.abstracts.chain;

import org.junit.Assert;
import org.junit.Test;

public class ClassificaTest {

	@Test
	public void deveClassificarMegaPowerQuandoPossuirMaisDe10ModulosEUmAvancado() {
		ClassificaCliente service = ClassificaCliente.getInstance();
		Cliente cliente = new Cliente();
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloAvancado());
		
		Classificacao classificacao = service.classificar(cliente);
		classificacao.direcionarLigacao();

		Assert.assertEquals("Diretor do desenvolvimento", classificacao.getResponsavel());
		Assert.assertTrue(classificacao instanceof ClassificacaoMegaPower);
	}

	@Test
	public void deveClassificarPowerQuandoPossuirMaisDe10ModulosBasico() {
		ClassificaCliente service = ClassificaCliente.getInstance();
		Cliente cliente = new Cliente();
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		
		Classificacao classificacao = service.classificar(cliente);
		classificacao.direcionarLigacao();

		Assert.assertEquals("Coordenador do desenvolvimento", classificacao.getResponsavel());
		Assert.assertTrue(classificacao instanceof ClassificacaoPower);
	}
	
	@Test
	public void deveClassificarPremiumPlusQuandoPossuirMaisDe5ModulosBasicoE1Avancado() {
		ClassificaCliente service = ClassificaCliente.getInstance();
		Cliente cliente = new Cliente();
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloAvancado());
		
		Classificacao classificacao = service.classificar(cliente);
		classificacao.direcionarLigacao();

		Assert.assertEquals("Nivel III do suporte", classificacao.getResponsavel());
		Assert.assertTrue(classificacao instanceof ClassificacaoPremiumPlus);
	}
	
	@Test
	public void deveClassificarPremiumQuandoPossuir1ModuloAvancado() {
		ClassificaCliente service = ClassificaCliente.getInstance();
		Cliente cliente = new Cliente();
		cliente.adicionar(new ModuloAvancado());
		
		Classificacao classificacao = service.classificar(cliente);
		classificacao.direcionarLigacao();

		Assert.assertEquals("Nivel II do suporte", classificacao.getResponsavel());
		Assert.assertTrue(classificacao instanceof ClassificacaoPremium);
	}
	
	@Test
	public void deveClassificarGoldQuandoPossuir3ModulosBasico() {
		ClassificaCliente service = ClassificaCliente.getInstance();
		Cliente cliente = new Cliente();
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		
		Classificacao classificacao = service.classificar(cliente);
		classificacao.direcionarLigacao();

		Assert.assertEquals("Nivel I do suporte", classificacao.getResponsavel());
		Assert.assertTrue(classificacao instanceof ClassificacaoGold);
	}
	
	@Test
	public void deveClassificarBasicQuandoPossuirAte2ModulosBasicos() {
		ClassificaCliente service = ClassificaCliente.getInstance();
		Cliente cliente = new Cliente();
		cliente.adicionar(new ModuloBasico());
		cliente.adicionar(new ModuloBasico());
		
		Classificacao classificacao = service.classificar(cliente);
		classificacao.direcionarLigacao();

		Assert.assertEquals("Estagiarios do suporte", classificacao.getResponsavel());
		Assert.assertTrue(classificacao instanceof ClassificacaoBasic);
	}		
}

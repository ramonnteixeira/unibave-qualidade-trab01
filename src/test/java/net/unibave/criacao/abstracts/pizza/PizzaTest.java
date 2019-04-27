package net.unibave.criacao.abstracts.pizza;

import java.util.Collection;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class PizzaTest {

    @Test
    public void deveInformarPizzariaFechada() {
        final Pedido pedido = new Pedido("21/04/2019");
        List<String> cardapio = pedido.getCardapio();
        Assert.assertEquals("Pizzaria fechada", cardapio.get(0));
    }

    @Test
    public void deveTerPizzaCalabrezaNasSegundasQuartasESextas() {
        Pedido pedido = new Pedido("22/04/2019");
        List<String> cardapio = pedido.getCardapio();
        Assert.assertFalse(cardapio.contains("Pizza de Presunto"));
        Assert.assertTrue(cardapio.contains("Pizza de Calabresa"));        

        pedido = new Pedido("24/04/2019");
        cardapio = pedido.getCardapio();
        Assert.assertFalse(cardapio.contains("Pizza de Presunto"));
        Assert.assertTrue(cardapio.contains("Pizza de Calabresa"));        

        pedido = new Pedido("26/04/2019");
        cardapio = pedido.getCardapio();
        Assert.assertFalse(cardapio.contains("Pizza de Presunto"));
        Assert.assertTrue(cardapio.contains("Pizza de Calabresa"));
    }

    @Test
    public void deveTerPizzaPresuntoNasTercasQuintasESabados() {
        Pedido pedido = new Pedido("23/04/2019");
        List<String> cardapio = pedido.getCardapio();
        Assert.assertTrue(cardapio.contains("Pizza de Presunto"));
        Assert.assertFalse(cardapio.contains("Pizza de Calabresa"));        

        pedido = new Pedido("25/04/2019");
        cardapio = pedido.getCardapio();
        Assert.assertTrue(cardapio.contains("Pizza de Presunto"));
        Assert.assertFalse(cardapio.contains("Pizza de Calabresa"));        

        pedido = new Pedido("27/04/2019");
        cardapio = pedido.getCardapio();
        Assert.assertTrue(cardapio.contains("Pizza de Presunto"));
        Assert.assertFalse(cardapio.contains("Pizza de Calabresa"));        
    }
    
}

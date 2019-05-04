package net.unibave.factory.nome;

import net.unibave.factory.nome.PessoaFactory;
import net.unibave.factory.nome.Pessoa;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NomeFactoryTest {


    @Test
    public void deve_receber_nome_com_sobrenome() {
        final String expected = "Jhon Smith";
        
        final Pessoa pessoa = PessoaFactory.newInstance("Jhon Smith");
        assertEquals(expected, pessoa.toString());
        assertEquals("Jhon", pessoa.getNome());
        assertEquals("Smith", pessoa.getSobrenome());
        
        final Pessoa pessoa2 = PessoaFactory.newInstance("Smith, Jhon");
        assertEquals(expected, pessoa2.toString());
        assertEquals("Jhon", pessoa2.getNome());
        assertEquals("Smith", pessoa2.getSobrenome());
    }
    
}

package net.unibave.factory.secreto;

import net.unibave.factory.secreto.ArquivoConfidencial;
import net.unibave.factory.secreto.ArquivoFactory;
import net.unibave.factory.secreto.Arquivo;
import net.unibave.factory.secreto.ArquivoPublico;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArquivoFactoryTest {

    @Test
    public void deve_retornar_arquivo_publico_quando_nao_ter_senha() {
        Arquivo arquivo = ArquivoFactory.getInstance("senha_invalida");
        assertEquals(ArquivoPublico.class, arquivo.behavior.getClass());
        arquivo.print();
    }
    
    @Test
    public void deve_retornar_arquivo_confidencial_quando_tem_senha() {
        Arquivo arquivo = ArquivoFactory.getInstance("designpatterns");
        assertEquals(ArquivoConfidencial.class, arquivo.behavior.getClass());
        arquivo.print();
    }
    
}

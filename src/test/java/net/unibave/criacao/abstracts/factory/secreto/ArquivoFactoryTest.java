package net.unibave.criacao.abstracts.factory.secreto;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ArquivoFactoryTest {

    @Test
    public void deve_retornar_arquivo_publico_quando_nao_ter_senha() {
        Arquivo arquivo = ArquivoFactory.getInstance("senha_invalida");
        assertEquals(ArquivoPublico.class, arquivo.getClass());
        arquivo.print();
    }
    
    @Test
    public void deve_retornar_arquivo_confidencial_quando_tem_senha() {
        Arquivo arquivo = ArquivoFactory.getInstance("designpatterns");
        assertEquals(ArquivoConfidencial.class, arquivo.getClass());
        arquivo.print();
    }
    
}

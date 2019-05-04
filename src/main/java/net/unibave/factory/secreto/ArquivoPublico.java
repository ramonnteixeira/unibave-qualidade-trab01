package net.unibave.factory.secreto;

public class ArquivoPublico implements ArquivoBehavior {

    public String getConteudo() {
        return "Este arquivo é publico, você deve ter a senha para acessar conteudos privados.";
    }
    
}

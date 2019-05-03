package net.unibave.criacao.abstracts.factory.secreto;

public class ArquivoPublico extends Arquivo {

    public String getConteudo() {
        return "Este arquivo é publico, você deve ter a senha para acessar conteudos privados.";
    }
    
}

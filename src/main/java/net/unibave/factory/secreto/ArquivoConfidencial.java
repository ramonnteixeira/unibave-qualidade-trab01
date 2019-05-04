package net.unibave.factory.secreto;

public class ArquivoConfidencial implements ArquivoBehavior {

    public String getConteudo() {
        return "Estas são informações confidenciais, quer dizer então que você tem a senha.";
    }
    
}

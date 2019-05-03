package net.unibave.criacao.abstracts.factory.secreto;

class ArquivoFactory {

    public static Arquivo getInstance(String senha) {
        switch(senha) {
            case "designpatterns": return new ArquivoConfidencial();
            default: return new ArquivoPublico();
        }
    }
    
}

package net.unibave.factory.secreto;

class ArquivoFactory {

    public static Arquivo getInstance(String senha) {
        switch(senha) {
            case "designpatterns": return new Arquivo(new ArquivoConfidencial());
            default: return new Arquivo(new ArquivoPublico());
        }
    }
    
}

package net.unibave.criacao.abstracts.factory.nome;

public class PessoaFactory {
    
    private PessoaFactory() {}
    
    public static Pessoa newInstance(String param) {
        if (param.contains(",")) {
            return new PessoaReferencia(param);
        }
        return new PessoaLiteral(param);
    }

}

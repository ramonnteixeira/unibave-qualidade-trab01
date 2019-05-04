package net.unibave.factory.nome;

public class PessoaFactory {
    
    private PessoaFactory() {}
    
    public static Pessoa newInstance(String param) {
        if (param.contains(",")) {
            return new Pessoa(new NomeReferencia()).parse(param);
        }
        return new Pessoa(new NomeLiteral()).parse(param);
    }

}

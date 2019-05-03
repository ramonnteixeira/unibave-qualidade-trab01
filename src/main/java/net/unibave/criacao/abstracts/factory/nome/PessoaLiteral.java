package net.unibave.criacao.abstracts.factory.nome;

public class PessoaLiteral extends Pessoa {

    public PessoaLiteral(String param) {
        String[] nomeCompleto = param.split(" ", 2);
        nome = nomeCompleto[0];
        sobrenome = nomeCompleto[1];
    }
    
}

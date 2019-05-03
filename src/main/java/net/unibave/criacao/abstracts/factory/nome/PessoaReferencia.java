package net.unibave.criacao.abstracts.factory.nome;

public class PessoaReferencia extends Pessoa {

    public PessoaReferencia(String param) {
        String[] nomeCompleto = param.split(", ", 2);
        sobrenome = nomeCompleto[0];
        nome = nomeCompleto[1];
    }
    
}

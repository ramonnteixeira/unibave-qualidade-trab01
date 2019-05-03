package net.unibave.criacao.abstracts.factory.nome;

abstract class Pessoa {
    
    String nome;
    String sobrenome;

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    @Override
    public String toString() {
        return String.format("%s %s", nome, sobrenome);
    }
    
}

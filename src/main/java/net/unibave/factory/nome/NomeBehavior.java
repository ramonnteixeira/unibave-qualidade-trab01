package net.unibave.factory.nome;

abstract class NomeBehavior {

    String nome;
    String sobrenome;

    abstract void parse(String nomeCompleto);
    
}

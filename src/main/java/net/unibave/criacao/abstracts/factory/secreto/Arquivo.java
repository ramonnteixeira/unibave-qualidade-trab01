package net.unibave.criacao.abstracts.factory.secreto;

abstract class Arquivo {
    
    void print() {
        System.out.println(getConteudo());
    }
    
    abstract String getConteudo();
}

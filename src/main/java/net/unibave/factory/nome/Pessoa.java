package net.unibave.factory.nome;

class Pessoa {
    
    final NomeBehavior nomeBehavior;

    public Pessoa(NomeBehavior nomeBehavior) {
        this.nomeBehavior = nomeBehavior;
    }
    
    public Pessoa parse(String nome) {
        this.nomeBehavior.parse(nome);
        return this;
    }
    
    public String getNome() {
        return nomeBehavior.nome;
    }

    public String getSobrenome() {
        return nomeBehavior.sobrenome;
    }

    @Override
    public String toString() {
        return String.format("%s %s", getNome(), getSobrenome());
    }
    
}

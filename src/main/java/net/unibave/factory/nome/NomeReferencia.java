package net.unibave.factory.nome;

public class NomeReferencia extends NomeBehavior {

    public void parse(String param) {
        String[] nomeCompleto = param.split(", ", 2);
        sobrenome = nomeCompleto[0];
        nome = nomeCompleto[1];
    }
    
}

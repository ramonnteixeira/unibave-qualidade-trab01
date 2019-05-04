package net.unibave.factory.nome;

public class NomeLiteral extends NomeBehavior {

    public void parse(String param) {
        String[] nomeCompleto = param.split(" ", 2);
        nome = nomeCompleto[0];
        sobrenome = nomeCompleto[1];
    }
    
}

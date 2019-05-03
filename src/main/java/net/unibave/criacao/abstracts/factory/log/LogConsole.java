package net.unibave.criacao.abstracts.factory.log;

public class LogConsole implements Log {

    @Override
    public void imprimir(String texto) {
        System.out.println(texto);
    }
    
}

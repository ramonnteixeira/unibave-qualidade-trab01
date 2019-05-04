package net.unibave.factory.log;

public class LogConsole implements LogBehavior {

    @Override
    public void imprimir(String texto) {
        System.out.println(texto);
    }
    
}

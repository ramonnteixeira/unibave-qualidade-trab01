package net.unibave.factory.log;

class Log {
    
    final LogBehavior logBehavior;

    public Log(LogBehavior logBehavior) {
        this.logBehavior = logBehavior;
    }
    
    void imprimir(String texto) {
        logBehavior.imprimir(texto);
    }

}

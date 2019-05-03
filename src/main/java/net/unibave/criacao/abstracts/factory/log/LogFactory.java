package net.unibave.criacao.abstracts.factory.log;

class LogFactory {

    static Log getInstance(String tipo) {
        switch(tipo) {
            case "arquivo": return new LogArquivo();
            case "console": return new LogConsole();
            default: return null;
        }
    }

}

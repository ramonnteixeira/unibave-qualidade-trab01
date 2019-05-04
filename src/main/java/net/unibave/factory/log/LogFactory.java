package net.unibave.factory.log;

class LogFactory {

    static Log getInstance(String tipo) {
        switch(tipo) {
            case "arquivo": return new Log(new LogArquivo());
            case "console": return new Log(new LogConsole());
            default: return null;
        }
    }

}

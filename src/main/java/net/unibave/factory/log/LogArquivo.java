package net.unibave.factory.log;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class LogArquivo implements LogBehavior {

    File arquivo;

    public LogArquivo() {
        try {
            this.arquivo = File.createTempFile("APP", "LOG");
        } catch (Exception e){
            this.arquivo = new File("log.txt");
            e.printStackTrace();
        }
    }
    
    
    @Override
    public void imprimir(final String texto) {
        try {           
            Files.write(
                arquivo.toPath(), 
                String.format("%s\n", texto).getBytes(), 
                StandardOpenOption.APPEND
            );
        } catch (Exception e) {
          e.printStackTrace();
        }
    }

}

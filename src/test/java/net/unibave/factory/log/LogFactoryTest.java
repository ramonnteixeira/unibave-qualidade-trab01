package net.unibave.factory.log;

import net.unibave.factory.log.LogArquivo;
import net.unibave.factory.log.Log;
import net.unibave.factory.log.LogFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class LogFactoryTest {
    
    @Test
    public void deve_imprimir_log_em_arquivo() throws IOException {
        Log logger = LogFactory.getInstance("arquivo");
        for (int i = 1; i < 11; i++) {
            logger.imprimir(String.valueOf(i));
        }
        
        List<String> line = Files.readAllLines(((LogArquivo) logger.logBehavior).arquivo.toPath());
        Assert.assertEquals("1", line.get(0).trim());
        Assert.assertEquals("2", line.get(1).trim());
        Assert.assertEquals("3", line.get(2).trim());
        Assert.assertEquals("4", line.get(3).trim());
        Assert.assertEquals("10", line.get(9).trim());
        
    }
  
    @Test
    public void deve_imprimir_log_em_console() throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        System.setOut(stream);
        
        Log logger = LogFactory.getInstance("console");
        for (int i = 1; i < 11; i++) {
            logger.imprimir(String.valueOf(i));
        }
        
        String[] result = new String(output.toByteArray()).split(System.lineSeparator());
        Assert.assertEquals("1", result[0].trim());
        Assert.assertEquals("2", result[1].trim());
        Assert.assertEquals("3", result[2].trim());
        Assert.assertEquals("4", result[3].trim());
        Assert.assertEquals("10", result[9].trim());
        
    }
    
}

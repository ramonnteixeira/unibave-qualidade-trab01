package net.unibave.abstracts.hello;

import net.unibave.abstracts.hello.HelloWorldFactory;
import net.unibave.abstracts.hello.HelloWorldFile;
import net.unibave.abstracts.hello.HelloWorld;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import org.junit.Assert;
import org.junit.Test;

public class HelloTest {
    
    @Test
    public void deveAlternarEntreMetodos() throws IOException {
        HelloWorld hello = HelloWorldFactory.getInstance();
        
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(output);
        System.setOut(stream);
        //altera a saida no teste para poder validar a saida em memoria
        hello.print();
        
        String result = new String(output.toByteArray());
        Assert.assertEquals("Hello world", result.trim());
        
        
        hello = HelloWorldFactory.getInstance();
        hello.print();
        
        String line = Files.readAllLines(((HelloWorldFile) hello).file.toPath()).get(0);
        Assert.assertEquals("Hello world", line.trim());
    }
}

package net.unibave.abstracts.hello;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.charset.Charset;

public class HelloWorldFile implements HelloWorld {

    File file;

    public HelloWorldFile() {
        try {
            this.file = File.createTempFile("output", "");        
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @Override
    public void print() {
        try (FileOutputStream writer = new FileOutputStream(file)) {
            writer.write("Hello world".getBytes(Charset.defaultCharset()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}

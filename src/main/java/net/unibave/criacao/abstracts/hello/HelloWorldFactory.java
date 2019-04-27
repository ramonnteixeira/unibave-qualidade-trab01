package net.unibave.criacao.abstracts.hello;

public class HelloWorldFactory {
   
    private static HelloWorld actualInstance = new HelloWorldFile();
    
    static HelloWorld getInstance() {
        if (actualInstance instanceof HelloWorldDisplay) {
            actualInstance = new HelloWorldFile();
        } else {
            actualInstance = new HelloWorldDisplay();            
        }
        
        return actualInstance;
    }
    
}
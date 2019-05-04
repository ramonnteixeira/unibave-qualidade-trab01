package net.unibave.abstracts.hello;

public class HelloWorldFactory {
   
    private static HelloWorld actualInstance = new HelloWorldFile();
    
    private HelloWorldFactory() {}
    
    static HelloWorld getInstance() {
        if (actualInstance instanceof HelloWorldDisplay) {
            actualInstance = new HelloWorldFile();
        } else {
            actualInstance = new HelloWorldDisplay();            
        }
        
        return actualInstance;
    }
    
}

package net.unibave.abstracts.pizza;

public class Pizza extends Massa {

    public Pizza(String sabor) {
        super(sabor);
    }
    
    @Override
    String getTipo() {
        return "Pizza";
    }
    
}

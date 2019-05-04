package net.unibave.abstracts.pizza;

abstract class Massa {
    
    final String sabor;

    public Massa(String sabor) {
        this.sabor = sabor;
    }

    abstract String getTipo();
    
    @Override
    public String toString() {
        return String.format("%s de %s", getTipo(), sabor);
    }
}

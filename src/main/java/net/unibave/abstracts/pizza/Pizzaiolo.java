package net.unibave.abstracts.pizza;

import java.util.Arrays;
import java.util.List;

class Pizzaiolo {

    List<Massa> massas;    

    public Pizzaiolo(Massa... massas) {
        this.massas = Arrays.asList(massas);
    }
    
}

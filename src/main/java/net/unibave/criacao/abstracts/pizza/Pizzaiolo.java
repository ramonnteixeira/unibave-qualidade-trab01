package net.unibave.criacao.abstracts.pizza;

import java.util.Arrays;
import java.util.List;

class Pizzaiolo {

    List<Massa> massas;    

    public Pizzaiolo(Massa... massas) {
        this.massas = Arrays.asList(massas);
    }
    
}

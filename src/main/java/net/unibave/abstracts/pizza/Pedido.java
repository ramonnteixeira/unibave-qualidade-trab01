package net.unibave.abstracts.pizza;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Pedido {

    private final LocalDate dia;
    
    public Pedido(String dia) {
        this(LocalDate.parse(dia, DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public Pedido(LocalDate dia) {
        this.dia = dia;
    }

    List<String> getCardapio() {
        final List<Pizzaiolo> pizzaiolos = PizzaioloFactory.getInstance(dia.getDayOfWeek());
        
        Set<String> massas = 
                pizzaiolos
                        .stream()
                        .flatMap(e -> e.massas.stream())
                        .map(Object::toString)
                        .collect(Collectors.toSet());
              
        if (massas.isEmpty()) {
            return Arrays.asList("Pizzaria fechada");
        }
        
        return massas.stream().collect(Collectors.toList());
    }
    
}

package net.unibave.criacao.abstracts.pizza;

import java.time.DayOfWeek;
import java.util.Arrays;
import java.util.List;

class PizzaioloFactory {

    static final Pizzaiolo CARA_DA_SEGUNDA_QUARTA_SEXTA = new Pizzaiolo(new Pizza("Calabresa"));
    static final Pizzaiolo CARA_DA_TERCA_QUINTA_SABADO = new Pizzaiolo(new Pizza("Presunto"));

    static List<Pizzaiolo> getInstance(DayOfWeek dayOfWeek) {
        switch (dayOfWeek) {
            case MONDAY: case WEDNESDAY: case FRIDAY:
                return Arrays.asList(CARA_DA_SEGUNDA_QUARTA_SEXTA);
            case TUESDAY: case THURSDAY: case SATURDAY:
                return Arrays.asList(CARA_DA_TERCA_QUINTA_SABADO);
        }
        return Arrays.asList();
    }
    
}

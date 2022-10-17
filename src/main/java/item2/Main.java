package item2;

import static item2.NyPizza.Size.SMALL;
import static item2.Pizza.Topping.*;

public class Main {

    public static void main(String[] args) {
        NyPizza pizza = new NyPizza.Builder(SMALL)
                .addTopping(SAUSAGE).addTopping(ONION).build();
        Calzone calzone = new Calzone.Builder().addTopping(HAM).sauceInside().build();

        pizza.toppings.forEach(topping -> System.out.println(topping.name()));

    }
}

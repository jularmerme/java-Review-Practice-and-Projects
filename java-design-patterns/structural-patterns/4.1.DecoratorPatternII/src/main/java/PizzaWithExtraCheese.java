import java.util.ArrayList;

public class PizzaWithExtraCheese implements Pizza {

    ArrayList toppings;
    Pizza pizza;

    public PizzaWithExtraCheese(Pizza pizza) {
        this.pizza = pizza;
        toppings = pizza.getToppings();
        toppings.add("Extra Cheese");
    }

    public ArrayList getToppings() { return toppings; }

    public String getName() { return pizza.getName(); }
}

package CiroVitiello.U5W1D1.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Menu {
    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public void printMenu() {
        System.out.println("----------------------- PIZZAS ----------------------------");
        pizzas.forEach(pizza -> System.out.println(pizza.getName() + " " + pizza.getCalories() + " Kcal " + pizza.getPrice() + " € "));
        System.out.println("----------------------- TOPPINGS ----------------------------");
        toppings.forEach(topping -> System.out.println(topping.getName() + " " + topping.getCalories() + " Kcal " + topping.getPrice() + " € "));
        System.out.println("----------------------- DRINKS ----------------------------");
        drinks.forEach(drink -> System.out.println(drink.getName() + " " + drink.getCalories() + " Kcal " + drink.getPrice() + " € "));
    }
}

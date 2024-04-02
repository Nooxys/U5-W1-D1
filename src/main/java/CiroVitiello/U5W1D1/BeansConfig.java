package CiroVitiello.U5W1D1;

import CiroVitiello.U5W1D1.entities.Drink;
import CiroVitiello.U5W1D1.entities.Menu;
import CiroVitiello.U5W1D1.entities.Pizza;
import CiroVitiello.U5W1D1.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeansConfig {
    @Bean
    public Drink getWater() {
        return new Drink("water", 0, 1.99);
    }

    @Bean
    public Drink getWine() {
        return new Drink("wine", 200, 5.99);
    }

    @Bean
    public Drink getCola() {
        return new Drink("Cola", 163, 2.99);
    }

    @Bean
    public Topping getTomato() {
        return new Topping("tomato", 29, 0.49);
    }

    @Bean
    public Topping getMozzarella() {
        return new Topping("mozzarella", 99, 0.89);
    }

    @Bean
    public Topping getFries() {
        return new Topping("fries", 399, 2.99);
    }

    @Bean
    public Topping getWurstel() {
        return new Topping("wurstel", 259, 1.99);
    }

    @Bean
    public Topping getSalami() {
        return new Topping("salami", 189, 1.59);
    }

    @Bean
    public Pizza getMargherita() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getMozzarella());
        toppings.add(getTomato());
        return new Pizza("Margherita", toppings, 900 + getMozzarella().getCalories() + getTomato().getCalories(), 5.99);
    }

    @Bean
    public Pizza getMargheritaXL() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getMozzarella());
        toppings.add(getTomato());
        return new Pizza("Margherita XL", toppings, 1200 + getMozzarella().getCalories() + getTomato().getCalories(), 7.99);
    }

    @Bean
    public Pizza getAmericana() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getMozzarella());
        toppings.add(getTomato());
        toppings.add(getFries());
        toppings.add(getWurstel());
        return new Pizza("Americana", toppings, 900 + getMozzarella().getCalories() + getTomato().getCalories() + getFries().getCalories() + getWurstel().getCalories(), 7.99);
    }

    @Bean
    public Pizza getAmericanaXL() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getMozzarella());
        toppings.add(getTomato());
        toppings.add(getFries());
        toppings.add(getWurstel());
        return new Pizza("Americana XL", toppings, 1200 + getMozzarella().getCalories() + getTomato().getCalories() + getFries().getCalories() + getWurstel().getCalories(), 8.99);
    }

    @Bean
    public Pizza getDiavola() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getMozzarella());
        toppings.add(getTomato());
        toppings.add(getSalami());
        return new Pizza("Diavola", toppings, 900 + getMozzarella().getCalories() + getTomato().getCalories() + getSalami().getCalories(), 5.99);
    }

    @Bean
    public Pizza getDiavolaXL() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getMozzarella());
        toppings.add(getTomato());
        toppings.add(getSalami());
        return new Pizza("Diavola XL", toppings, 1200 + getMozzarella().getCalories() + getTomato().getCalories() + getSalami().getCalories(), 8.99);
    }

    @Bean
    public Pizza getEpiPizza() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getMozzarella());
        toppings.add(getTomato());
        toppings.add(getSalami());
        toppings.add(getFries());
        toppings.add(getWurstel());
        return new Pizza("EpiPizza", toppings, 900 + getMozzarella().getCalories() + getTomato().getCalories() + getWurstel().getCalories() + getFries().getCalories() + getSalami().getCalories(), 9.99);
    }

    @Bean
    public Pizza getEpiPizzaXL() {
        List<Topping> toppings = new ArrayList<>();
        toppings.add(getMozzarella());
        toppings.add(getTomato());
        toppings.add(getSalami());
        toppings.add(getFries());
        toppings.add(getWurstel());
        return new Pizza("EpiPizza XL", toppings, 1200 + getMozzarella().getCalories() + getTomato().getCalories() + getWurstel().getCalories() + getFries().getCalories() + getSalami().getCalories(), 13.99);
    }

    @Bean
    public Menu GetMenu() {
        List<Pizza> pizzaList = new ArrayList<>();
        List<Topping> toppingList = new ArrayList<>();
        List<Drink> drinkList = new ArrayList<>();
        pizzaList.add(getEpiPizza());
        pizzaList.add(getEpiPizzaXL());
        pizzaList.add(getDiavola());
        pizzaList.add(getDiavolaXL());
        pizzaList.add(getAmericana());
        pizzaList.add(getAmericanaXL());
        pizzaList.add(getMargherita());
        pizzaList.add(getMargheritaXL());
        toppingList.add(getMozzarella());
        toppingList.add(getTomato());
        toppingList.add(getSalami());
        toppingList.add(getFries());
        toppingList.add(getWurstel());
        drinkList.add(getWine());
        drinkList.add(getCola());
        drinkList.add(getWater());
        return new Menu(pizzaList, toppingList, drinkList);
    }
}

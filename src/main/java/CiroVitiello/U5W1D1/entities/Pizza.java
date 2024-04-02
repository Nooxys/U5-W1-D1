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
public class Pizza {
    private String name;
    private List<Topping> toppings;
    private int calories;
    private double price;
}

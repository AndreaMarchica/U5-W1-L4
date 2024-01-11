package andreamarchica.U5W1L2.entities;

import java.util.List;

        import jakarta.persistence.Entity;
        import jakarta.persistence.GeneratedValue;
        import jakarta.persistence.Id;
        import jakarta.persistence.Table;
        import lombok.AllArgsConstructor;
        import lombok.Getter;
        import lombok.NoArgsConstructor;
        import lombok.ToString;
        import org.springframework.stereotype.Component;

        import java.io.PrintStream;
        import java.util.List;
        import java.util.Objects;
/*@Entity*/
@Table(name = "menu")
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Menu {
    @Id
    @GeneratedValue
    private long id;
    private List<Pizza> pizzaList;
    private List<Drink> drinkList;
    private List<Topping> toppingList;



    public void printMenu() {
        System.out.println("******* Menu *******");
        System.out.println("PIZZAS");
        this.pizzaList.forEach(System.out::println);
        System.out.println();

        System.out.println("TOPPINGS");
        this.toppingList.forEach(System.out::println);
        System.out.println();

        System.out.println("DRINKS");
        this.drinkList.forEach(System.out::println);
        System.out.println();

    }
}
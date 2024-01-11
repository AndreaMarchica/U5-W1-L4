package andreamarchica.U5W1L2.entities;

        import java.util.ArrayList;
        import java.util.List;

        import org.springframework.beans.factory.annotation.Value;
        import org.springframework.context.annotation.Bean;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("application.properties")
public class BeanConfig {
    public BeanConfig() {
    }

    @Bean(
            name = {"toppings_tomato"}
    )
    public Topping toppingTomatoBean() {
        return new Topping("Tomato", 0, 0.0);
    }

    @Bean(
            name = {"toppings_cheese"}
    )
    public Topping toppingCheeseBean() {
        return new Topping("Cheese", 92, 0.69);
    }

    @Bean(
            name = {"toppings_ham"}
    )
    public Topping toppingHamBean() {
        return new Topping("Ham", 35, 0.99);
    }

    @Bean(
            name = {"toppings_pineapple"}
    )
    public Topping toppingPineappleBean() {
        return new Topping("Pineapple", 24, 0.79);
    }

    @Bean(
            name = {"toppings_salami"}
    )
    public Topping toppingSalamiBean() {
        return new Topping("Salami", 86, 0.99);
    }

    @Bean(
            name = {"pizza_margherita"}
    )
    public Pizza pizzaMargheritaBean() {
        List<Topping> tList = new ArrayList();
        tList.add(this.toppingTomatoBean());
        tList.add(this.toppingCheeseBean());
        return new Pizza("Pizza Margherita", tList, false);
    }

    @Bean(
            name = {"hawaiian_pizza"}
    )
    public Pizza pizzaHawaiianBean() {
        List<Topping> tList = new ArrayList();
        tList.add(this.toppingTomatoBean());
        tList.add(this.toppingCheeseBean());
        tList.add(this.toppingHamBean());
        tList.add(this.toppingPineappleBean());
        return new Pizza("Hawaiian Pizza", tList, false);
    }

    @Bean(
            name = {"salami_pizza"}
    )
    public Pizza pizzaSalamiBean() {
        List<Topping> tList = new ArrayList();
        tList.add(this.toppingTomatoBean());
        tList.add(this.toppingCheeseBean());
        tList.add(this.toppingSalamiBean());
        return new Pizza("Salami Pizza", tList, false);
    }

    @Bean(
            name = {"salami_pizza_xl"}
    )
    public Pizza pizzaSalamiXlBean() {
        List<Topping> tList = new ArrayList();
        tList.add(this.toppingTomatoBean());
        tList.add(this.toppingCheeseBean());
        tList.add(this.toppingSalamiBean());
        return new Pizza("Salami Pizza XL", tList, true);
    }

    @Bean(
            name = {"lemonade"}
    )
    public Drink lemonadeBean() {
        return new Drink("Lemonade", 128, 1.29);
    }

    @Bean(
            name = {"water"}
    )
    public Drink waterBean() {
        return new Drink("Water", 0, 1.29);
    }

    @Bean(
            name = {"wine"}
    )
    public Drink wineBean() {
        return new Drink("Wine", 607, 7.49);
    }

    @Bean({"pizzas"})
    List<Pizza> pizzaList() {
        List<Pizza> pizzas = new ArrayList();
        pizzas.add(this.pizzaMargheritaBean());
        pizzas.add(this.pizzaHawaiianBean());
        pizzas.add(this.pizzaSalamiBean());
        pizzas.add(this.pizzaSalamiXlBean());
        return pizzas;
    }

    @Bean({"drinks"})
    List<Drink> drinksList() {
        List<Drink> drinks = new ArrayList();
        drinks.add(this.lemonadeBean());
        drinks.add(this.waterBean());
        drinks.add(this.wineBean());
        return drinks;
    }

    @Bean({"toppings"})
    List<Topping> toppingsList() {
        List<Topping> toppings = new ArrayList();
        toppings.add(this.toppingTomatoBean());
        toppings.add(this.toppingCheeseBean());
        toppings.add(this.toppingSalamiBean());
        toppings.add(this.toppingHamBean());
        toppings.add(this.toppingPineappleBean());
        return toppings;
    }

    @Bean({"Tavolo1"})
    andreamarchica.U5W1L2.entities.Table getTable1(@Value("${seat.price}") double seatPrice) {
        return new andreamarchica.U5W1L2.entities.Table(1, 1, 5, true, seatPrice);
    }

    @Bean({"Tavolo2"})
    andreamarchica.U5W1L2.entities.Table getTable2(@Value("${seat.price}") double seatPrice) {
        return new andreamarchica.U5W1L2.entities.Table(2, 2, 4, true, seatPrice);
    }

    @Bean({"Tavolo3"})
    andreamarchica.U5W1L2.entities.Table getTable3(@Value("${seat.price}") double seatPrice) {
        return new andreamarchica.U5W1L2.entities.Table(3, 3, 8, true, seatPrice);
    }
}

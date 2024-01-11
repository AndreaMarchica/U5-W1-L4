package andreamarchica.U5W1L2;

import andreamarchica.U5W1L2.entities.*;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

public class PizzeriaTest {

    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(new Class[]{U5W1L2Application.class});


    @Test
    public void testMargheritaPrice(){
        System.out.println("It's the right price for a Margherita?");
        double finalPrice = 4.99;
        double pizzaPrice = ctx.getBean("pizza_margherita", Pizza.class).getPrice();
/*        double cheesePrice = ctx.getBean("toppings_cheese", Topping.class).getPrice();
        double expectedPrice = pizzaPrice + cheesePrice;*/
        assertEquals(finalPrice, pizzaPrice);
    }

/*
    @Test
    public void testMargheritaCalories(){
        System.out.println("Has Margherita 1104 calories?");
        int pizzaCalories = getBean(Pizza.class).getMargheritaCalories();
    }
*/

/*    @ParameterizedTest
    @CsvSource({"1, 1, 2", "2, 2, 4", "3, 3, 6"}) // <-- utile quando abbiamo da fornire valori MULTIPLI
    // @ValueSource(ints = {1, 2, 3}) <-- utile quando abbiamo da fornire una serie di valori SINGOLI (non è questo il caso)
    public void testParameterizedSum(int add1, int add2, int expectedResult) {
        int result = CustomMath.sum(add1, add2);
        assertEquals(expectedResult, result);
    }*/
}

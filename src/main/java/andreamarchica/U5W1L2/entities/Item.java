package andreamarchica.U5W1L2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.NoArgsConstructor;

/*@Entity*/
public abstract class Item {
    @Id
    @GeneratedValue
    private long id;
    protected int calories;
    protected double price;

    public Item(){};

    public Item(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }

    public int getCalories() {
        return this.calories;
    }

    public double getPrice() {
        return this.price;
    }
}

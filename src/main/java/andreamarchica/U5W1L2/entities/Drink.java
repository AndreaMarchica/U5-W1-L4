package andreamarchica.U5W1L2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Entity
@Table(name = "drinks")
@Getter
public class Drink extends Item {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    public Drink(){};
    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    public String toString() {
        return "Drink{name='" + this.name + "', calories=" + this.calories + ", price=" + this.price + "}";
    }

    public void setName(final String name) {
        this.name = name;
    }
}

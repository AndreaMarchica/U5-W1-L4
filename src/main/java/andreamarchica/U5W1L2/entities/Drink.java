package andreamarchica.U5W1L2.entities;

public class Drink extends Item {
    private String name;

    public Drink(String name, int calories, double price) {
        super(calories, price);
        this.name = name;
    }

    public String toString() {
        return "Drink{name='" + this.name + "', calories=" + this.calories + ", price=" + this.price + "}";
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }
}

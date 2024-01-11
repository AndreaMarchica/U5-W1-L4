package andreamarchica.U5W1L2.entities;


public abstract class Item {
    protected int calories;
    protected double price;

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

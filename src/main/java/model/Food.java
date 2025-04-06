package model;

public abstract class Food implements Discountable{
    private int amount;
    private double price;
    private boolean isVegetarian;

    public Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    public double getTotalPrice() {
        return amount * price;
    }

    public double getDiscount() {
        return 0.0;
    }
}

package model;

import model.constants.Colour;
import model.constants.Discount;

public class Apple extends Food implements Discountable{
    private String colour;

    public Apple(int amount, double price, String color) {
        super(amount, price,true);
        this.colour = color;
    }

    @Override
    public double getDiscount() {
        if (Colour.RED.equals(colour)) {
            return Discount.RED_APPLE;
        } else {
            return 0.0;
        }
    }
}

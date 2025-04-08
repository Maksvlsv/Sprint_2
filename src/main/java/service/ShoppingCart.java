package service;

import model.Food;

public class ShoppingCart {
    private Food[] products;

    public ShoppingCart(Food[] products) {
        this.products = products;
    }

    public double getTotalPrice() {
        double total = 0.0;
        for (int i = 0; i < products.length; i++) {
            total += products[i].getTotalPrice();
        }
        return total;
    }

    public double getTotalPriceWithDiscount() {
        double total = 0.0;
        for (int i = 0; i < products.length; i++) {
            double price = products[i].getTotalPrice();
            price -= products[i].getDiscount() * price / 100;
            total += price;
        }
        return total;
    }

    public double getTotalVegetarianPrice() {
        double total = 0.0;
        for (int i = 0; i < products.length; i++) {
            if (products[i].isVegetarian()) {
                total += products[i].getTotalPrice();
            }
        }
        return total;
    }
}
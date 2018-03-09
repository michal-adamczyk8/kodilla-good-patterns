package com.kodilla.good.patterns.food.producent;

import com.kodilla.good.patterns.food.order.Order;

public class ExtraFoodShop implements Producer {
    @Override
    public boolean process(Order order) {
        if (order.getQuantity() > 15) {
            System.out.println("Dziękujemy za zakupu e Extra Food Shoop");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "ExtraFoodShop";
    }
}

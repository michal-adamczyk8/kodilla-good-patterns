package com.kodilla.good.patterns.food.producent;

import com.kodilla.good.patterns.food.order.Order;

public class HealthyShop implements Producer {
    @Override
    public boolean process(Order order) {
        System.out.println("Dziękujemy za zakupy w Health Shop!");
        return true;
    }

    @Override
    public String toString() {
        return "HealthyShop";
    }
}

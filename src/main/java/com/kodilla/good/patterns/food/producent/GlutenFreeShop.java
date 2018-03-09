package com.kodilla.good.patterns.food.producent;

import com.kodilla.good.patterns.food.order.Order;

public class GlutenFreeShop implements Producer {
    @Override
    public boolean process(Order order) {
        if (order.getQuantity() == 1) {
            System.out.println("Witamy w Gluten Free Shop drogi bezglutenowcy. W naszym sklepie Gluten to największy wróg. " +
                    "Dziękujemy,że wybrałeś nasze usługi!");
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "GlutenFreeShop";
    }
}
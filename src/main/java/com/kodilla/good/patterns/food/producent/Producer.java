package com.kodilla.good.patterns.food.producent;

import com.kodilla.good.patterns.food.order.Order;

public interface Producer {
    boolean process(Order order);
}

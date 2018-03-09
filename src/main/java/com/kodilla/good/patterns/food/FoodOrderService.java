package com.kodilla.good.patterns.food;

import com.kodilla.good.patterns.food.order.Order;
import com.kodilla.good.patterns.food.producent.Producer;

public class FoodOrderService {
    Producer producer;
    Order order;

    public FoodOrderService(Producer producer, Order order) {
        this.producer = producer;
        this.order = order;
    }

    public void foodOrder() {
        if (producer.process(order)) {
            System.out.println("Gratulacje! Udało Ci się złożycć zamównienie na " + order.getProduct() + " w ilości "
                    + order.getQuantity() + " od " + order.getProducer().toString() +
                    " Prosimy dokonać płatości w ciągu 7 dni.");
        }
    }
}

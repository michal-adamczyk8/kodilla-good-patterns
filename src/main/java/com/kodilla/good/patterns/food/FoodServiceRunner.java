package com.kodilla.good.patterns.food;

import com.kodilla.good.patterns.food.order.Order;
import com.kodilla.good.patterns.food.producent.ExtraFoodShop;
import com.kodilla.good.patterns.food.producent.Producer;

public class FoodServiceRunner {
    public static void main(String[] args) {
        Producer extraFoodShop = new ExtraFoodShop();
        Order order = new Order(extraFoodShop, "Milk", 74 );
        FoodOrderService foodOrderService = new FoodOrderService(extraFoodShop, order);
        foodOrderService.foodOrder();
    }
}

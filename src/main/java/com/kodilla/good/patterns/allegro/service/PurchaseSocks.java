package com.kodilla.good.patterns.allegro.service;

import com.kodilla.good.patterns.allegro.User;

public class PurchaseSocks implements PurchaseService {
    @Override
    public boolean purchase(User user, String product, double quantity, double price){
        System.out.println(user.getUsername() + " kupił " + quantity + " " + product + " po cenie " + price);
        return true;
    }
}

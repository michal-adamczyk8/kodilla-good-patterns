package com.kodilla.good.patterns.allegro.repository;

import com.kodilla.good.patterns.allegro.User;

public class PurchasedSocksRepository implements PurchaseRepository{
    @Override
    public void createPurchase(User user, String product, double quantity, double price){
        System.out.println(user.getUsername() + " kupił " + quantity + " " + product + " po cenie " + price);
    }



}

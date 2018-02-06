package com.kodilla.good.patterns.allegro.repository;

import com.kodilla.good.patterns.allegro.User;

public interface PurchaseRepository {
    void createPurchase(User user, String product, double quantity, double price);
}

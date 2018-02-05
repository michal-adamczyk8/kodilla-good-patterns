package com.kodilla.good.patterns.allegro.purchaseService;

import com.kodilla.good.patterns.allegro.User;

public interface PurchaseService {
    boolean purchase(User user, String product, double quantity, double price);
}
